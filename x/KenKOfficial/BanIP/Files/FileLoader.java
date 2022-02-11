package x.KenKOfficial.BanIP.Files;

import x.KenKOfficial.BanIP.Main.*;
import java.io.*;
import java.util.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class FileLoader
{
    private /* synthetic */ Main main;
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ File BASIC_DIR;
    private static final /* synthetic */ int[] Il;
    
    public FileLoader(final Main IlIllllllllllll) {
        this.main = IlIllllllllllll;
        this.init();
    }
    
    private static void IIl() {
        (Il = new int[4])[0] = ((93 + 44 - 51 + 91 ^ 54 + 4 + 56 + 74) & (0x43 ^ 0x11 ^ (0x2C ^ 0x73) ^ -" ".length()));
        FileLoader.Il[1] = " ".length();
        FileLoader.Il[2] = "  ".length();
        FileLoader.Il[3] = "   ".length();
    }
    
    static {
        IIl();
        ll();
        BASIC_DIR = new File(String.valueOf(new StringBuilder().append(FileLoader.I[FileLoader.Il[1]]).append(Main.getPlugin().getName()).append(FileLoader.I[FileLoader.Il[2]])));
    }
    
    private static boolean lIl(final int IlllIIlllllllll) {
        return IlllIIlllllllll == 0;
    }
    
    private static boolean Ill(final int lIIIlIlllllllll, final int IIIIlIlllllllll) {
        return lIIIlIlllllllll < IIIIlIlllllllll;
    }
    
    private static String Il(String lIIlIllllllllll, final String IIIlIllllllllll) {
        lIIlIllllllllll = (int)new String(Base64.getDecoder().decode(((String)lIIlIllllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIllIllllllllll = new StringBuilder();
        final char[] llIlIllllllllll = IIIlIllllllllll.toCharArray();
        int IlIlIllllllllll = FileLoader.Il[0];
        final float IIlIIllllllllll = (Object)((String)lIIlIllllllllll).toCharArray();
        final boolean llIIIllllllllll = IIlIIllllllllll.length != 0;
        String IlIIIllllllllll = (String)FileLoader.Il[0];
        while (Ill((int)IlIIIllllllllll, llIIIllllllllll ? 1 : 0)) {
            final char llllIllllllllll = IIlIIllllllllll[IlIIIllllllllll];
            IIllIllllllllll.append((char)(llllIllllllllll ^ llIlIllllllllll[IlIlIllllllllll % llIlIllllllllll.length]));
            "".length();
            ++IlIlIllllllllll;
            ++IlIIIllllllllll;
            "".length();
            if (((0x73 ^ 0x4A) & ~(0x55 ^ 0x6C)) != ((0x2B ^ 0x30) & ~(0x47 ^ 0x5C))) {
                return null;
            }
        }
        return String.valueOf(IIllIllllllllll);
    }
    
    private void init() {
        System.out.println(FileLoader.I[FileLoader.Il[0]]);
        if (lIl(FileLoader.BASIC_DIR.exists() ? 1 : 0)) {
            FileLoader.BASIC_DIR.mkdirs();
            "".length();
        }
    }
    
    private static String I(final String lllIlIlllllllll, final String IIIllIlllllllll) {
        try {
            final SecretKeySpec IIlllIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIllIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIllIlllllllll = Cipher.getInstance("Blowfish");
            llIllIlllllllll.init(FileLoader.Il[2], IIlllIlllllllll);
            return new String(llIllIlllllllll.doFinal(Base64.getDecoder().decode(lllIlIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIllIlllllllll) {
            IlIllIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void ll() {
        (I = new String[FileLoader.Il[3]])[FileLoader.Il[0]] = I("/SvfWl4k5yKWd1/MarzCH8rxPh6xDK5bXwItobgIa6PFoAL+ni27IQ==", "tpxEp");
        FileLoader.I[FileLoader.Il[1]] = I("GHoV4UP4A3bn84kECZSbDA==", "ZqKKF");
        FileLoader.I[FileLoader.Il[2]] = Il("axQXOQsU", "DVvWB");
    }
}
