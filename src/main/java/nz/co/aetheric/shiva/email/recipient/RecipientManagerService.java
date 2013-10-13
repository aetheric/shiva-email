package nz.co.aetheric.shiva.email.recipient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * This is the default implementation of the {@link RecipientManager} interface.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Slf4j
public class RecipientManagerService implements RecipientManager {

	/**
	 * Creates a recipient with a default type of {@link RecipientType#TO}.
	 *
	 * @param address The address to send the email to.
	 * @return A new recipient with a type of {@link RecipientType#TO}.
	 */
	public Recipient recipientTo(String address) {
		return new Recipient(address, RecipientType.TO);
	}

	/**
	 * Transforms the provided collection of addresses into a collection of Recipients. Uses {@link #recipientTo} as
	 * the transform function.
	 *
	 * @param addresses The addresses to send the email to.
	 * @return A collection of Recipients of type {@link RecipientType#TO}.
	 */
	public Collection<Recipient> recipientsTo(Collection<String> addresses) {
		return Collections2.transform(addresses, new RecipientTransformer(RecipientType.TO));
	}

	/**
	 * Creates a recipient with a default type of {@link RecipientType#COPY}.
	 *
	 * @param address The address to send the email to.
	 * @return A new recipient with a type of {@link RecipientType#COPY}.
	 */
	public Recipient recipientCopy(String address) {
		return new Recipient(address, RecipientType.COPY);
	}

	/**
	 * Transforms the provided collection of addresses into a collection of Recipients. Uses {@link #recipientCopy} as
	 * the transform function.
	 *
	 * @param addresses The addresses to send the email to.
	 * @return A collection of Recipients of type {@link RecipientType#COPY}.
	 */
	public Collection<Recipient> recipientsCopy(Collection<String> addresses) {
		return Collections2.transform(addresses, new RecipientTransformer(RecipientType.COPY));
	}

	/**
	 * Creates a recipient with a default type of {@link RecipientType#BLIND}.
	 *
	 * @param address The address to send the email to.
	 * @return A new recipient with a type of {@link RecipientType#BLIND}.
	 */
	public Recipient recipientBlind(String address) {
		return new Recipient(address, RecipientType.BLIND);
	}

	/**
	 * Transforms the provided collection of addresses into a collection of Recipients. Uses {@link #recipientBlind} as
	 * the transform function.
	 *
	 * @param addresses The addresses to send the email to.
	 * @return A collection of Recipients of type {@link RecipientType#BLIND}.
	 */
	public Collection<Recipient> recipientsBlind(Collection<String> addresses) {
		return Collections2.transform(addresses, new RecipientTransformer(RecipientType.BLIND));
	}

}
