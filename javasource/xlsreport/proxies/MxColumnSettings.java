// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

/**
 * 
 */
public class MxColumnSettings
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mxColumnSettingsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "XLSReport.MxColumnSettings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ColumnIndex("ColumnIndex"),
		AutoSize("AutoSize"),
		ColumnWidth("ColumnWidth"),
		ColumnSettings_MxSheet("XLSReport.ColumnSettings_MxSheet");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MxColumnSettings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "XLSReport.MxColumnSettings"));
	}

	protected MxColumnSettings(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxColumnSettingsMendixObject)
	{
		if (mxColumnSettingsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("XLSReport.MxColumnSettings", mxColumnSettingsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a XLSReport.MxColumnSettings");

		this.mxColumnSettingsMendixObject = mxColumnSettingsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxColumnSettings.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static xlsreport.proxies.MxColumnSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return xlsreport.proxies.MxColumnSettings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static xlsreport.proxies.MxColumnSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new xlsreport.proxies.MxColumnSettings(context, mendixObject);
	}

	public static xlsreport.proxies.MxColumnSettings load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return xlsreport.proxies.MxColumnSettings.initialize(context, mendixObject);
	}

	public static java.util.List<xlsreport.proxies.MxColumnSettings> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<xlsreport.proxies.MxColumnSettings> result = new java.util.ArrayList<xlsreport.proxies.MxColumnSettings>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//XLSReport.MxColumnSettings" + xpathConstraint))
			result.add(xlsreport.proxies.MxColumnSettings.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ColumnIndex
	 */
	public final Integer getColumnIndex()
	{
		return getColumnIndex(getContext());
	}

	/**
	 * @param context
	 * @return value of ColumnIndex
	 */
	public final Integer getColumnIndex(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.ColumnIndex.toString());
	}

	/**
	 * Set value of ColumnIndex
	 * @param columnindex
	 */
	public final void setColumnIndex(Integer columnindex)
	{
		setColumnIndex(getContext(), columnindex);
	}

	/**
	 * Set value of ColumnIndex
	 * @param context
	 * @param columnindex
	 */
	public final void setColumnIndex(com.mendix.systemwideinterfaces.core.IContext context, Integer columnindex)
	{
		getMendixObject().setValue(context, MemberNames.ColumnIndex.toString(), columnindex);
	}

	/**
	 * @return value of AutoSize
	 */
	public final Boolean getAutoSize()
	{
		return getAutoSize(getContext());
	}

	/**
	 * @param context
	 * @return value of AutoSize
	 */
	public final Boolean getAutoSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.AutoSize.toString());
	}

	/**
	 * Set value of AutoSize
	 * @param autosize
	 */
	public final void setAutoSize(Boolean autosize)
	{
		setAutoSize(getContext(), autosize);
	}

	/**
	 * Set value of AutoSize
	 * @param context
	 * @param autosize
	 */
	public final void setAutoSize(com.mendix.systemwideinterfaces.core.IContext context, Boolean autosize)
	{
		getMendixObject().setValue(context, MemberNames.AutoSize.toString(), autosize);
	}

	/**
	 * @return value of ColumnWidth
	 */
	public final Integer getColumnWidth()
	{
		return getColumnWidth(getContext());
	}

	/**
	 * @param context
	 * @return value of ColumnWidth
	 */
	public final Integer getColumnWidth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.ColumnWidth.toString());
	}

	/**
	 * Set value of ColumnWidth
	 * @param columnwidth
	 */
	public final void setColumnWidth(Integer columnwidth)
	{
		setColumnWidth(getContext(), columnwidth);
	}

	/**
	 * Set value of ColumnWidth
	 * @param context
	 * @param columnwidth
	 */
	public final void setColumnWidth(com.mendix.systemwideinterfaces.core.IContext context, Integer columnwidth)
	{
		getMendixObject().setValue(context, MemberNames.ColumnWidth.toString(), columnwidth);
	}

	/**
	 * @return value of ColumnSettings_MxSheet
	 */
	public final xlsreport.proxies.MxSheet getColumnSettings_MxSheet() throws com.mendix.core.CoreException
	{
		return getColumnSettings_MxSheet(getContext());
	}

	/**
	 * @param context
	 * @return value of ColumnSettings_MxSheet
	 */
	public final xlsreport.proxies.MxSheet getColumnSettings_MxSheet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxSheet result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ColumnSettings_MxSheet.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxSheet.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ColumnSettings_MxSheet
	 * @param columnsettings_mxsheet
	 */
	public final void setColumnSettings_MxSheet(xlsreport.proxies.MxSheet columnsettings_mxsheet)
	{
		setColumnSettings_MxSheet(getContext(), columnsettings_mxsheet);
	}

	/**
	 * Set value of ColumnSettings_MxSheet
	 * @param context
	 * @param columnsettings_mxsheet
	 */
	public final void setColumnSettings_MxSheet(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxSheet columnsettings_mxsheet)
	{
		if (columnsettings_mxsheet == null)
			getMendixObject().setValue(context, MemberNames.ColumnSettings_MxSheet.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ColumnSettings_MxSheet.toString(), columnsettings_mxsheet.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mxColumnSettingsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final xlsreport.proxies.MxColumnSettings that = (xlsreport.proxies.MxColumnSettings) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "XLSReport.MxColumnSettings";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}