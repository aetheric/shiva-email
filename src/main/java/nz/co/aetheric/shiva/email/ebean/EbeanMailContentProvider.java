package nz.co.aetheric.shiva.email.ebean;

import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.ExpressionList;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import nz.co.aetheric.shiva.email.ShivaMailException;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * This is the ebean persistence implementation of {@link MailContentProvider}.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Slf4j
public class EbeanMailContentProvider implements MailContentProvider {

	@Getter	@Setter
	private EbeanServer ebean;

	@Override
	public MailContent getMailContent(String key, Locale locale, String type) throws ShivaMailException {
		return singleResult(buildQuery(key, locale, type));
	}

	@Override
	public Collection<? extends MailContent> getMailContent(String key, Locale locale) throws ShivaMailException {
		return listResult(buildQuery(key, locale, null));
	}

	protected ExpressionList<EbeanMailContent> buildQuery(String key, Locale locale, String type) {
		ExpressionList<EbeanMailContent> query = startQuery();

		filterKey(query, key);
		filterLocale(query, locale);

		if (StringUtils.isNotBlank(type)) {
			filterType(query, type);
		}

		return query;
	}

	protected ExpressionList<EbeanMailContent> startQuery() {
		return ebean.find(EbeanMailContent.class).where();
	}

	protected void filterKey(ExpressionList<EbeanMailContent> query, String key) {
		query.eq("key", key);
	}

	protected void filterLocale(ExpressionList<EbeanMailContent> query, Locale locale) {
		if (locale == null) {
			query.isNull("locale");
		} else {
			String language = locale.getLanguage();
			query.eq("locale", language);
		}
	}

	protected void filterType(ExpressionList<EbeanMailContent> query, String type) {
		query.eq("type", type);
	}

	protected EbeanMailContent singleResult(ExpressionList<EbeanMailContent> query) {
		return query.findUnique();
	}

	protected List<EbeanMailContent> listResult(ExpressionList<EbeanMailContent> query) {
		return query.findList();
	}

}
