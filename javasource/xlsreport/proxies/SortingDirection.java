// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum SortingDirection
{
	Asc(new String[][] { new String[] { "en_US", "Ascending" }, new String[] { "nl_NL", "Volgorde oplopend" } }),
	Desc(new String[][] { new String[] { "en_US", "Descending" }, new String[] { "nl_NL", "Volgorde aflopend" } });

	private java.util.Map<String,String> captions;

	private SortingDirection(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}