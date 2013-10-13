package nz.co.aetheric.shiva.email.ebean;

import javax.persistence.Entity;
import java.util.Locale;

/**
 * This is the ebean persistence implementation of {@link MailContent}.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Entity(name = "shiva_mail_content")
public class EbeanMailContent implements MailContent {

	private String key;
	private String locale;
	private String type;
	private String body;

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public Locale getLocale() {
		return locale == null
				? null
				: new Locale(locale);
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getBody() {
		return body;
	}

}
