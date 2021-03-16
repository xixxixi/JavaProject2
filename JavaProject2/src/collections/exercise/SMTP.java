package collections.exercise;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Date;
import java.util.Properties;

public class SMTP {
	public static void sendMessage() {
		
	}
	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.smtp.host", "smtp.naver.com");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.port", "587");
		Authenticator auth = new MyAuthentication();
		Session session = Session.getDefaultInstance(p, auth);
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setSentDate(new Date());
			InternetAddress from = new InternetAddress();
			from = new InternetAddress("xixxixi@naver.com");
			msg.setFrom(from);
			InternetAddress to = new InternetAddress("xozxw@naver.com");
			msg.setRecipient(Message.RecipientType.TO, to);
			msg.setSubject("메일 테스트", "UTF-8");
			msg.setText("테스트2", "UTF-8");
			msg.setHeader("content-Type", "text/html");
			javax.mail.Transport.send(msg);
			System.out.println("send ok");
		} catch (AddressException addr_e) {
			addr_e.printStackTrace();
		} catch (MessagingException msg_e) {
			msg_e.printStackTrace();
		}
	}
}

class MyAuthentication extends Authenticator {
	PasswordAuthentication account;

	public MyAuthentication() {
		String id = "xixxixi";
		String pw = "goaqjrj@0707";
		account = new PasswordAuthentication(id, pw);
	}

	public PasswordAuthentication getPasswordAuthentication() {
		return account;
	}
}

