package nz.co.aetheric.shiva.email.recipient;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import lombok.Getter;

import java.util.Collection;

/**
 * This class represents a single email recipient.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public class Recipient {

	@Getter
	protected final String address;

	@Getter
	protected final RecipientType type;

	/**
	 * Creates a recipient with a default type of {@link RecipientType#TO}.
	 *
	 * @param address The address to send the email to.
	 */
	public Recipient(String address) {
		this(address, RecipientType.TO);
	}

	/**
	 * Creates a recipient with the provided type.
	 *
	 * @param address The address to send the email to.
	 * @param type    The type of recipient this is.
	 */
	public Recipient(String address, RecipientType type) {
		this.address = address;
		this.type = type;
	}

}
