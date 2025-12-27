/**
 * @author VISTALL
 * @since 2025-12-27
 */
module consulo.images.format.photoshop {
    requires consulo.component.api;

    requires consulo.library.twelvemonkeys.imageio;

    requires com.twelvemonkeys.imageio.psd;

    requires java.desktop; // TODO move to desktop awt module!

    provides javax.imageio.spi.ImageReaderSpi with consulo.images.format.photoshop.HackPSDImageReaderSpi;
}