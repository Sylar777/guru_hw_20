package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface DeviceConfig extends Config {
    @Key("browserstack.user")
    @DefaultValue("daniilsosnovskiy_Ww940N")
    String user();
    @Key("browserstack.key")
    @DefaultValue("CNW4RCY2TqbfXSy6UxmQ")
    String key();
    @DefaultValue("Google Pixel 3")
    String device();
    @DefaultValue("9.0")
    String os_version();
    @DefaultValue("bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
    String app();
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String url();
}
