package x.KenKOfficial.BanIP.Apis;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import x.KenKOfficial.BanIP.Main.*;
import org.bukkit.configuration.file.*;
import java.io.*;

public class API
{
    private static final /* synthetic */ String[] l;
    private static final /* synthetic */ int[] ll;
    
    private static String l(final String IIIIlIIllllllll, final String llllIIIllllllll) {
        try {
            final SecretKeySpec lIlIlIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIllllllll.getBytes(StandardCharsets.UTF_8)), API.ll[8]), "DES");
            final Cipher IIlIlIIllllllll = Cipher.getInstance("DES");
            IIlIlIIllllllll.init(API.ll[2], lIlIlIIllllllll);
            return new String(IIlIlIIllllllll.doFinal(Base64.getDecoder().decode(IIIIlIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIllllllll) {
            llIIlIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIl(final int llllIllIlllllll) {
        return llllIllIlllllll != 0;
    }
    
    private static String IIIl(final String lIlllIIllllllll, final String IIlllIIllllllll) {
        try {
            final SecretKeySpec IlIIIlIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlllIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIIIlIllllllll = Cipher.getInstance("Blowfish");
            lIIIIlIllllllll.init(API.ll[2], IlIIIlIllllllll);
            return new String(lIIIIlIllllllll.doFinal(Base64.getDecoder().decode(lIlllIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIlIllllllll) {
            IIIIIlIllllllll.printStackTrace();
            return null;
        }
    }
    
    public static String getBanIP(final String IIllIlIllllllll) {
        final File llIlIlIllllllll = new File(String.valueOf(new StringBuilder().append(API.l[API.ll[8]]).append(Main.getPlugin().getName()).append(API.l[API.ll[9]]).append(IIllIlIllllllll).append(API.l[API.ll[10]])));
        if (llIl(llIlIlIllllllll.exists() ? 1 : 0)) {
            final YamlConfiguration IlllIlIllllllll = YamlConfiguration.loadConfiguration(llIlIlIllllllll);
            final String lIllIlIllllllll = String.valueOf(new StringBuilder().append(IlllIlIllllllll.getString(API.l[API.ll[11]])).append(API.l[API.ll[12]]).append(IlllIlIllllllll.getString(API.l[API.ll[13]])));
            return lIllIlIllllllll;
        }
        return null;
    }
    
    public static void setUnbanIP(final String IIlIllIllllllll) {
        final File lIlIllIllllllll = new File(String.valueOf(new StringBuilder().append(API.l[API.ll[5]]).append(Main.getPlugin().getName()).append(API.l[API.ll[6]]).append(IIlIllIllllllll).append(API.l[API.ll[7]])));
        lIlIllIllllllll.delete();
        "".length();
    }
    
    static {
        IlIl();
        lIIl();
    }
    
    public static void setBanIP(final String llIIIIlllllllll, final String IlIIIIlllllllll, final String IIllllIllllllll) {
        final File IIIIIIlllllllll = new File(String.valueOf(new StringBuilder().append(API.l[API.ll[0]]).append(Main.getPlugin().getName()).append(API.l[API.ll[1]]).append(llIIIIlllllllll).append(API.l[API.ll[2]])));
        final YamlConfiguration llllllIllllllll = YamlConfiguration.loadConfiguration(IIIIIIlllllllll);
        llllllIllllllll.set(API.l[API.ll[3]], (Object)IlIIIIlllllllll);
        llllllIllllllll.set(API.l[API.ll[4]], (Object)IIllllIllllllll);
        try {
            llllllIllllllll.save(IIIIIIlllllllll);
            "".length();
            if (-(0x2 ^ 0x4C ^ (0xFA ^ 0xB0)) > 0) {
                return;
            }
        }
        catch (IOException IIlIIIlllllllll) {
            IIlIIIlllllllll.printStackTrace();
        }
    }
    
    private static boolean IIll(final int IlIIlllIlllllll, final int lIIIlllIlllllll) {
        return IlIIlllIlllllll < lIIIlllIlllllll;
    }
    
    private static String lll(String lIlllllIlllllll, final String IIlllllIlllllll) {
        lIlllllIlllllll = (double)new String(Base64.getDecoder().decode(((String)lIlllllIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIIIIIllllllll = new StringBuilder();
        final char[] lllllllIlllllll = IIlllllIlllllll.toCharArray();
        int IllllllIlllllll = API.ll[0];
        final short IIIllllIlllllll = (Object)((String)lIlllllIlllllll).toCharArray();
        final long lllIlllIlllllll = IIIllllIlllllll.length;
        float IllIlllIlllllll = API.ll[0];
        while (IIll((int)IllIlllIlllllll, (int)lllIlllIlllllll)) {
            final char llIIIIIllllllll = IIIllllIlllllll[IllIlllIlllllll];
            IIIIIIIllllllll.append((char)(llIIIIIllllllll ^ lllllllIlllllll[IllllllIlllllll % lllllllIlllllll.length]));
            "".length();
            ++IllllllIlllllll;
            ++IllIlllIlllllll;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(IIIIIIIllllllll);
    }
    
    private static void IlIl() {
        (ll = new int[15])[0] = ((225 + 210 - 398 + 199 ^ 105 + 19 - 122 + 139) & (187 + 92 - 165 + 81 ^ 152 + 36 - 134 + 108 ^ -" ".length()));
        API.ll[1] = " ".length();
        API.ll[2] = "  ".length();
        API.ll[3] = "   ".length();
        API.ll[4] = (((0x7 ^ 0x50) & ~(0xFA ^ 0xAD)) ^ (0xBA ^ 0xBE));
        API.ll[5] = (0x54 ^ 0x7E ^ (0xEB ^ 0xC4));
        API.ll[6] = (0xBA ^ 0xBC);
        API.ll[7] = (0xA8 ^ 0xAF);
        API.ll[8] = (0xA4 ^ 0xC3 ^ (0xAE ^ 0xC1));
        API.ll[9] = (0x61 ^ 0x68);
        API.ll[10] = (0x7F ^ 0x75);
        API.ll[11] = (0xB3 ^ 0xB8);
        API.ll[12] = (126 + 120 - 167 + 92 ^ 100 + 127 - 101 + 41);
        API.ll[13] = (29 + 41 - 48 + 164 ^ 177 + 40 - 115 + 81);
        API.ll[14] = (74 + 52 - 87 + 93 ^ 99 + 127 - 143 + 55);
    }
    
    private static void lIIl() {
        (l = new String[API.ll[14]])[API.ll[0]] = l("9jifCJkwEEQMMi+/BuufYA==", "LAKCo");
        API.l[API.ll[1]] = l("VFEZtzeyrnw=", "KxNTd");
        API.l[API.ll[2]] = lll("Yx0pPA==", "MdDPO");
        API.l[API.ll[3]] = IIIl("6dK1bVj4lv0=", "sFPNZ");
        API.l[API.ll[4]] = l("uJkeBH4eLw4=", "ZpRQS");
        API.l[API.ll[5]] = IIIl("/meNJdCOlAFLlx2gczv9AQ==", "JMkIZ");
        API.l[API.ll[6]] = l("Q/O22mE2YzE=", "YHokF");
        API.l[API.ll[7]] = lll("QD0bJQ==", "nDvIE");
        API.l[API.ll[8]] = lll("CC84IT8WMGI=", "xCMFV");
        API.l[API.ll[9]] = lll("SCENNj03TA==", "gclXt");
        API.l[API.ll[10]] = lll("dD0rOQ==", "ZDFUy");
        API.l[API.ll[11]] = lll("DCcJIiE=", "MCdKO");
        API.l[API.ll[12]] = lll("cQ==", "JxzRb");
        API.l[API.ll[13]] = lll("AhsYIBU=", "RtoOq");
    }
}
