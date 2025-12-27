/**
 * @author VISTALL
 * @since 27/12/2025
 */
module consulo.images.format.webp {
    requires consulo.component.api;

    requires consulo.library.twelvemonkeys.imageio;

    requires com.twelvemonkeys.imageio.webp;

    requires java.desktop; // TODO move to desktop awt module!

    provides javax.imageio.spi.ImageReaderSpi with consulo.images.format.webp.HackWebPImageReaderSpi;
}