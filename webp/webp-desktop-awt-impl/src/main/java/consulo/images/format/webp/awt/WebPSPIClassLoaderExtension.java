package consulo.images.format.webp.awt;

import consulo.annotation.component.ComponentProfiles;
import consulo.annotation.component.ExtensionImpl;
import consulo.component.extension.SPIClassLoaderExtension;
import jakarta.annotation.Nonnull;

import javax.imageio.ImageIO;
import java.util.Set;

/**
 * @author VISTALL
 * @since 2025-12-27
 */
@ExtensionImpl(profiles = ComponentProfiles.AWT)
public class WebPSPIClassLoaderExtension implements SPIClassLoaderExtension {
    @Nonnull
    @Override
    public Class<?> getTargetClass() {
        return ImageIO.class;
    }

    @Nonnull
    @Override
    public Set<String> getSupportedFileExtensions() {
        return Set.of("webp");
    }
}
