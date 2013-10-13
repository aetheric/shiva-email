package nz.co.aetheric.shiva.email.rendering;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import nz.co.aetheric.shiva.email.ShivaMailConfig;
import nz.co.aetheric.shiva.email.content.MailContentProvider;
import nz.co.aetheric.shiva.email.styling.MailStylingProvider;

import java.util.Collection;
import java.util.Locale;
import java.util.Map;

/**
 * TODO: What is the purpose of this class?
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Slf4j
public class MailRendererService implements MailRenderer {

	private Map<String, ? extends MailRenderingProvider> providers;

	@Getter @Setter
	private ShivaMailConfig config;

	@Getter @Setter
	private MailContentProvider content;

	@Getter @Setter
	private MailStylingProvider styling;

	public String renderTemplatePlain(String code, Locale locale, Map<String, Object> data) {

	}

	public String renderTemplateRich(String code, Locale locale, Map<String, Object> data) {
		Map<String, ? extends MailRenderingProvider> providers = Maps.newHashMap(this.providers);

		for (String renderingMethod : config.getPreferredRenderers()) {
			MailRenderingProvider provider = providers.get(renderingMethod);
			if (provider != null) {
				return provider.renderTemplate()
			}
		}
	}

	public void setProviders(Collection<? extends MailRenderingProvider> providers) {
		this.providers = Maps.uniqueIndex(providers, new MailRenderingProviderTypeTransform());
	}

	public Collection<? extends MailRenderingProvider> getProviders() {
		return providers.values();
	}

	protected class MailRenderingProviderTypeTransform implements Function<MailRenderingProvider, String> {
		@Override public String apply(MailRenderingProvider provider) {
			return provider.getRenderingType();
		}
	}

}
