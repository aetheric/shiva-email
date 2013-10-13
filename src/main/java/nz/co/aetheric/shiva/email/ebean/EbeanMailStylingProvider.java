package nz.co.aetheric.shiva.email.ebean;

import com.avaje.ebean.EbeanServer;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import nz.co.aetheric.shiva.email.ShivaMailException;

import java.util.List;

/**
 * This is the ebean persistence implementation of {@link MailStylingProvider}.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Slf4j
public class EbeanMailStylingProvider implements MailStylingProvider {

	@Getter	@Setter
	private EbeanServer ebean;

	@Override
	public MailStyling getMailStyling(String code) throws ShivaMailException {
		return null;
	}

	@Override
	public List<MailStyling> getMailStylings(String code) throws ShivaMailException {
		return null;
	}

}
