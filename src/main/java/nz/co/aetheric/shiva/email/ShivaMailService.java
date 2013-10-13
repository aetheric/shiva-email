package nz.co.aetheric.shiva.email;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import nz.co.aetheric.shiva.email.content.MailContent;
import nz.co.aetheric.shiva.email.recipient.Recipient;

import java.util.Collection;
import java.util.Locale;
import java.util.Map;

/**
 * This is the primary implementation of {@link ShivaMail}.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Slf4j
public class ShivaMailService implements ShivaMail {

	@Getter @Setter
	protected MailRenderingService rendering;

	@Getter @Setter
	protected ShivaMailConfig config;

	@Override
	public void send(String code, Locale locale, Map data, Collection<Recipient> recipients) throws ShivaMailException {

		MailContent plainTemplate = getMailContent(code, locale, getPlainRenderingType());
		MailContent richTemplate = getMailContent(code, locale, getRichRenderingType());



	}

	protected String getPlainRenderingType() {
		return renderingPlain.getRenderingType();
	}

	protected String getRichRenderingType() {
		return renderingRich.getRenderingType();
	}

	protected String renderContent(String content) {

	}

	protected String getRenderedContent(String code, Locale locale, String type) throws ShivaMailException {
		MailContent content = getMailContent(code, locale, type);
		return
	}

	protected MailContent getMailContent(String code, Locale locale, String type) throws ShivaMailException {
		return content.getMailContent(code, locale, type);
	}

}
