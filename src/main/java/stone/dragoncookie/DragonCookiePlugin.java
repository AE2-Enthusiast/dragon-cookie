package stone.dragoncookie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import zone.rong.mixinbooter.IEarlyMixinLoader;

@IFMLLoadingPlugin.Name("DragonCookiePlugin")
@IFMLLoadingPlugin.MCVersion(ForgeVersion.mcVersion)
public class DragonCookiePlugin implements IFMLLoadingPlugin, IEarlyMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        List<String> configs = new ArrayList<>();
        configs.add("mixins.dragon_cookie.json");
        return configs;
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[] {};
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {}

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

}
