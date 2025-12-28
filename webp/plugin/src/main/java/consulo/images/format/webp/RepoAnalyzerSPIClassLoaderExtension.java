package consulo.images.format.webp;

import consulo.annotation.component.ExtensionImpl;
import consulo.component.extension.SPIClassLoaderExtension;
import jakarta.annotation.Nonnull;

import java.util.Set;

/**
 * This is stub for analyzer. Not called from platform
 *
 * @author VISTALL
 * @since 2025-12-28
 */
@ExtensionImpl
public class RepoAnalyzerSPIClassLoaderExtension implements SPIClassLoaderExtension {
    @Nonnull
    @Override
    public Class<?> getTargetClass() {
        return Object.class;
    }

    @Nonnull
    @Override
    public Set<String> getSupportedFileExtensions() {
        return Set.of("webp");
    }
}
