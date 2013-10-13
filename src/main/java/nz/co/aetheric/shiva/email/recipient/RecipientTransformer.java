package nz.co.aetheric.shiva.email.recipient;

/**
 * This concrete Function implementation allows for quick collection transformations.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Slf4j
public class RecipientTransformer implements Function<String, Recipient> {

	protected final RecipientType type;

	public RecipientTransformer(RecipientType type) {
		this.type = type;
	}

	@Override
	public Recipient apply(String address) {
		return new Recipient(address, type);
	}

}
