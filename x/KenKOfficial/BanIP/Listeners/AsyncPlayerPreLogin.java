package x.KenKOfficial.BanIP.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.BanIP.Main.*;
import java.io.*;
import org.bukkit.configuration.file.*;
import x.KenKOfficial.BanIP.Utils.*;
import org.bukkit.event.*;
import java.util.*;

public class AsyncPlayerPreLogin implements Listener
{
    private static final /* synthetic */ int[] llll;
    private static final /* synthetic */ String[] Illl;
    
    private static String IlIIll(final String lllIIIlllIlllll, final String IllIIIlllIlllll) {
        try {
            final SecretKeySpec IIllIIlllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIIIlllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIlIIlllIlllll = Cipher.getInstance("Blowfish");
            llIlIIlllIlllll.init(AsyncPlayerPreLogin.llll[2], IIllIIlllIlllll);
            return new String(llIlIIlllIlllll.doFinal(Base64.getDecoder().decode(lllIIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIIlllIlllll) {
            IlIlIIlllIlllll.printStackTrace();
            return null;
        }
    }
    
    static {
        IIlIll();
        llIIll();
    }
    
    @EventHandler
    public void onLogin(final AsyncPlayerPreLoginEvent lIlllllllIlllll) {
        final File IIlllllllIlllll = new File(String.valueOf(new StringBuilder().append(AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[0]]).append(Main.getPlugin().getName()).append(AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[1]]).append(lIlllllllIlllll.getAddress().getHostAddress()).append(AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[2]])));
        if (lIlIll(IIlllllllIlllll.exists() ? 1 : 0)) {
            final YamlConfiguration lIIIIIIIIllllll = YamlConfiguration.loadConfiguration(IIlllllllIlllll);
            final List<String> IIIIIIIIIllllll = (List<String>)Main.getPlugin().getConfig().getStringList(AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[3]]);
            String lllllllllIlllll = AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[4]];
            int IlIIIIIIIllllll = AsyncPlayerPreLogin.llll[0];
            while (IllIll(IlIIIIIIIllllll, IIIIIIIIIllllll.size())) {
                lllllllllIlllll = String.valueOf(new StringBuilder().append(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(lllllllllIlllll))))))).append(IIIIIIIIIllllll.get(IlIIIIIIIllllll)));
                if (lllIll(IlIIIIIIIllllll, IIIIIIIIIllllll.size() - AsyncPlayerPreLogin.llll[2])) {
                    lllllllllIlllll = String.valueOf(new StringBuilder().append(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(lllllllllIlllll))))))).append(AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[5]]));
                }
                ++IlIIIIIIIllllll;
                "".length();
                if (null != null) {
                    return;
                }
            }
            lllllllllIlllll = lllllllllIlllll.replace(AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[6]], lIIIIIIIIllllll.getString(AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[7]]));
            lllllllllIlllll = lllllllllIlllll.replace(AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[8]], lIIIIIIIIllllll.getString(AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[9]]));
            lIlllllllIlllll.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER, ChatUtil.fixColor(lllllllllIlllll));
        }
    }
    
    private static boolean lIlIll(final int IlIlllIllIlllll) {
        return IlIlllIllIlllll != 0;
    }
    
    private static boolean lllIll(final int lIllllIllIlllll, final int IIllllIllIlllll) {
        return lIllllIllIlllll <= IIllllIllIlllll;
    }
    
    private static void IIlIll() {
        (llll = new int[11])[0] = ("  ".length() & ("  ".length() ^ -" ".length()));
        AsyncPlayerPreLogin.llll[1] = " ".length();
        AsyncPlayerPreLogin.llll[2] = "  ".length();
        AsyncPlayerPreLogin.llll[3] = "   ".length();
        AsyncPlayerPreLogin.llll[4] = (0x1F ^ 0x1B);
        AsyncPlayerPreLogin.llll[5] = (0x2 ^ 0x2B ^ (0x9B ^ 0xB7));
        AsyncPlayerPreLogin.llll[6] = (0x95 ^ 0x93);
        AsyncPlayerPreLogin.llll[7] = (0xF ^ 0x33 ^ (0x8C ^ 0xB7));
        AsyncPlayerPreLogin.llll[8] = (0x33 ^ 0x78 ^ (0x57 ^ 0x14));
        AsyncPlayerPreLogin.llll[9] = (0x3 ^ 0xA);
        AsyncPlayerPreLogin.llll[10] = (0x3A ^ 0x30);
    }
    
    private static String lIIIll(final String IIllIllllIlllll, final String lIllIllllIlllll) {
        try {
            final SecretKeySpec lIIIlllllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllllIlllll.getBytes(StandardCharsets.UTF_8)), AsyncPlayerPreLogin.llll[8]), "DES");
            final Cipher IIIIlllllIlllll = Cipher.getInstance("DES");
            IIIIlllllIlllll.init(AsyncPlayerPreLogin.llll[2], lIIIlllllIlllll);
            return new String(IIIIlllllIlllll.doFinal(Base64.getDecoder().decode(IIllIllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllllIlllll) {
            llllIllllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void llIIll() {
        (Illl = new String[AsyncPlayerPreLogin.llll[10]])[AsyncPlayerPreLogin.llll[0]] = IIIIll("BRQ6FCQbC2A=", "uxOsM");
        AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[1]] = lIIIll("jrguk6fW7mk=", "bujCS");
        AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[2]] = IlIIll("JP7MCMo5hq8=", "lmBfq");
        AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[3]] = IIIIll("PAMYMQMgFQI5FWcSDT4dOQ==", "IplPt");
        AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[4]] = IlIIll("Bcz8X4HWEdk=", "KXtsC");
        AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[5]] = IIIIll("EQQF", "jJxfu");
        AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[6]] = lIIIll("vrpFuKC0TJg=", "CTywo");
        AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[7]] = IIIIll("GQc9Gy4=", "IhJtJ");
        AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[8]] = IlIIll("nhrFyiJF67A=", "UGiND");
        AsyncPlayerPreLogin.Illl[AsyncPlayerPreLogin.llll[9]] = IlIIll("pfevWda7nso=", "azfVJ");
    }
    
    private static String IIIIll(String lIIllIlllIlllll, final String lIlllIlllIlllll) {
        lIIllIlllIlllll = new String(Base64.getDecoder().decode(lIIllIlllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIlllIlllIlllll = new StringBuilder();
        final char[] llIllIlllIlllll = lIlllIlllIlllll.toCharArray();
        int IlIllIlllIlllll = AsyncPlayerPreLogin.llll[0];
        final double IIlIlIlllIlllll = (Object)lIIllIlllIlllll.toCharArray();
        final double llIIlIlllIlllll = IIlIlIlllIlllll.length;
        double IlIIlIlllIlllll = AsyncPlayerPreLogin.llll[0];
        while (IllIll((int)IlIIlIlllIlllll, (int)llIIlIlllIlllll)) {
            final char lllllIlllIlllll = IIlIlIlllIlllll[IlIIlIlllIlllll];
            IIlllIlllIlllll.append((char)(lllllIlllIlllll ^ llIllIlllIlllll[IlIllIlllIlllll % llIllIlllIlllll.length]));
            "".length();
            ++IlIllIlllIlllll;
            ++IlIIlIlllIlllll;
            "".length();
            if (((0x52 ^ 0x58 ^ (0xD2 ^ 0x86)) & (158 + 136 - 125 + 80 ^ 99 + 87 - 19 + 0 ^ -" ".length())) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(IIlllIlllIlllll);
    }
    
    private static boolean IllIll(final int lIIIIIlllIlllll, final int IIIIIIlllIlllll) {
        return lIIIIIlllIlllll < IIIIIIlllIlllll;
    }
}
