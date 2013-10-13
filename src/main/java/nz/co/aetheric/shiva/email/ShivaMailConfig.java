package nz.co.aetheric.shiva.email;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * This class aggregates all the configuration information needed for running Shiva mail.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class ShivaMailConfig {

	@Getter @Setter
	protected String defaultSender;

	@Getter @Setter
	protected String defaultCopyRecipient;

	@Getter @Setter
	protected String defaultSubject;

	@Getter @Setter
	protected List<String> preferredRenderers;

}
