package mx.sep.expedicion.servicios.util.impl;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import mx.sep.expedicion.servicios.util.MailService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    private static final Logger log = Logger.getLogger(MailServiceImpl.class);
    private static final String FROM = "portal.servicios@nube.sep.gob.mx";
    @Autowired
    private JavaMailSender mailSender;
    /**
     * Envío de email
     * @param to      correo electrónico del destinatario
     * @param subject asunto del mensaje
     * @param text    cuerpo del mensaje (soporta HTML)
     */
    @Override
    public void send(String to, String subject, String text) {
        // 1. Validación básica de parámetros
        if (to == null || to.trim().isEmpty()) {
            throw new IllegalArgumentException("El destinatario (to) no puede ser nulo o vacío");
        }
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalArgumentException("El asunto (subject) no puede ser nulo o vacío");
        }
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("El cuerpo del mensaje (text) no puede ser nulo o vacío");
        }
        try {
            // 2. Construcción del mensaje
            final MimeMessage message = mailSender.createMimeMessage();
            final MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setFrom(FROM);
            helper.setText(text, true); // true = permite HTML
            // 3. Envío dentro del mismo try para capturar todo
            mailSender.send(message);
            log.info("Correo enviado correctamente a: " + to + " | Asunto: " + subject);
        } catch (MessagingException e) {
            log.error("Error al construir el mensaje de correo para: " + to, e);
            throw new RuntimeException("Error al construir el mensaje de correo", e);
        } catch (MailException e) {
            log.error("Error al enviar el correo a: " + to + " | Asunto: " + subject, e);
            throw new RuntimeException("Error al enviar el correo electronico", e);
        }
    }
}