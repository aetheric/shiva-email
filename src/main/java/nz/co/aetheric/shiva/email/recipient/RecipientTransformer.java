package nz.co.aetheric.shiva.email.recipient;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import lombok.extern.slf4j.Slf4j;

/**
 * This class provides a way to transform an address into a recipient for the purposes of collection transforms.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 * @see Collections2#transform
 */
@Slf4j
public class RecipientTransformer implements Function<String, Recipient> {

	/** The type of recipient to transform addresses into */
	protected final RecipientType type;

	/**
	 * Initialise a transformer with the provided type.
	 * @param type The type of recipient to transform addresses into.
	 */
	public RecipientTransformer(RecipientType type) {
		this.type = type;
	}

	/**
	 * Transform the provided address into a new recipient.
	 * @param address The address to create the recipient from.
	 * @return A new recipient instance with the provided address.
	 */
	@Override
	public Recipient apply(String address) {
		return new Recipient(address, type);
	}

}
