package mx.sep.expedicion.servicios.util.impl;
import javax.mail.MessagingException;  
import javax.mail.internet.MimeMessage;  
import mx.sep.expedicion.servicios.util.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.mail.javamail.MimeMessageHelper;  
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
  
@Service
@DependsOn("mailSender")
public class MailServiceImpl implements MailService {  
  
	@Autowired
	private JavaMailSender mailSender;
	  
    /** envío de email  
     * @param to correo electrónico del destinatario 
     * @param subject asunto del mensaje 
     * @param text cuerpo del mensaje 
     */  
    public void send(String to, String subject, String text) {  
        final MimeMessage message = mailSender.createMimeMessage();    
        try {  
            final MimeMessageHelper helper = new MimeMessageHelper(message, true);                
            helper.setTo(to);  
            helper.setSubject(subject);  
            helper.setFrom("portal.servicios@nube.sep.gob.mx");  
            helper.setText(text);                
        } catch (MessagingException e) {  
            new RuntimeException(e);  
        }            
        this.mailSender.send(message);  
    }    
}  
