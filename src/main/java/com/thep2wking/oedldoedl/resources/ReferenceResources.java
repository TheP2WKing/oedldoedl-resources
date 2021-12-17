package com.thep2wking.oedldoedl.resources;

public class ReferenceResources
{
	public static final String MODID = "oedldoedlresources";
	public static final String NAME = "Oedldoedl Resources";
	public static final String VERSION = "1.12.2-2.0.0";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2847,);"
											+ "required-after:oedldoedlcore@[1.12.2-2.1.0,);"
											+ "required-after:codechickenlib@[3.2.3.358,);"
											+ "required-after:avaritia@[3.3.0,);"
											+ "after:jei;"
											+ "after:theoneprobe;";
	public static final String CLIENT_PROXY_CLASS = "com.thep2wking.oedldoedl.resources.util.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.thep2wking.oedldoedl.resources.util.proxy.CommonProxy";
	public static final String SERVER_PROXY_CLASS = "com.thep2wking.oedldoedl.resources.util.proxy.ServerProxy";
}