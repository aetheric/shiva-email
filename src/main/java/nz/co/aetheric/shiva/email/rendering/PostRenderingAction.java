package nz.co.aetheric.shiva.email.rendering;

import nz.co.aetheric.shiva.email.content.MailContent;

import java.util.Collection;

/**
 * Describes an action that will be performed after a successful content rendering.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public interface PostRenderingAction {

	/**
	 * Provides access to a collection of {@link MailContent#getType MailContent types} that this action applies to.
	 * @return All the types this action should be run on.
	 */
	public Collection<String> getApplicableTypes();

	/**
	 * Gets run after content is rendered, but before it gets presented for sending. Useful for things like injecting
	 * css into the html, etc. There is no guarantee of execution order, so implementations should be careful.
	 * @param renderedContent The content that was rendered.
	 * @return The content expected to be fed to the next link in the chain.
	 */
	public String afterRendering(String renderedContent);

}
