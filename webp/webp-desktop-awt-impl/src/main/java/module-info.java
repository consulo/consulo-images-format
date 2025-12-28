/**
 * @author VISTALL
 * @since 2025-12-28
 */
module consulo.images.format.webp.awt {
    requires consulo.component.api;

    requires java.desktop;

    requires consulo.library.twelvemonkeys.imageio;

    requires com.twelvemonkeys.imageio.webp;

    provides javax.imageio.spi.ImageReaderSpi with consulo.images.format.webp.awt.HackWebPImageReaderSpi;
}