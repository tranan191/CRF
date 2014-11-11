package org.postagging.postaggers.crf.features;

import java.util.LinkedHashSet;
import java.util.Set;

import org.postagging.crf.features.Filter;
import org.postagging.crf.features.FilterFactory;
import org.postagging.crf.features.TokenAndTagFilter;
import org.postagging.crf.features.TwoTagsFilter;

/**
 * 
 * @author Asher Stern
 * Date: Nov 11, 2014
 *
 */
public class StandardFilterFactory implements FilterFactory<String, String>
{
	@Override
	public Set<Filter<String, String>> createFilters(String token, String currentTag, String previousTag)
	{
		Set<Filter<String, String>> ret = new LinkedHashSet<Filter<String,String>>();
		ret.add(new TwoTagsFilter<String, String>(token, currentTag, previousTag));
		ret.add(new TokenAndTagFilter<String, String>(token, currentTag, previousTag));
		return ret;
	}
}
