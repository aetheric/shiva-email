package nz.co.aetheric.shiva.email.ebean;

/**
 * This is the ebean persistence implementation of {@link MailStyling}.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class EbeanMailStyling implements MailStyling {

	private String code;
	private String styles;

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getStyles() {
		return styles;
	}

}
