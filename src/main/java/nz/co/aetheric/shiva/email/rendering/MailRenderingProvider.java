package nz.co.aetheric.shiva.email.rendering;

import nz.co.aetheric.shiva.email.content.MailContent;

import java.util.Map;

/**
 * This interface is the service definition for rendering email templates.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public interface MailRenderingProvider {

	/**
	 * Lets the operation rendering the mail know what kind of template to look for when rendering an email.
	 * @return The rendering type of the provider. Should match {@link MailContent#getType()}
	 */
	public String getRenderingType();

	/**
	 * Renders a particular template with the provided data.
	 * @param templateContent The template content to render.
	 * @param data The data to use while rendering the template.
	 * @return A rendered version of the template.
	 */
	public String renderTemplate(String templateContent, Map<String, Object> data);

}
