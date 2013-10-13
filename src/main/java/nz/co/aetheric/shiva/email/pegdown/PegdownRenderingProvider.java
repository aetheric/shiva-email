package nz.co.aetheric.shiva.email.pegdown;

import lombok.extern.slf4j.Slf4j;
import nz.co.aetheric.shiva.email.rendering.MailRenderingProvider;

import java.util.Map;

/**
 * This is the markdown implementation of the mail renderer.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Slf4j
public class PegdownRenderingProvider implements MailRenderingProvider {
	public static final String RENDERING_TYPE = "markdown";

	@Override
	public String getRenderingType() {
		return RENDERING_TYPE;
	}

	@Override
	public String renderTemplate(String templateContent, Map<String, Object> data) {
		return null;
	}

}
