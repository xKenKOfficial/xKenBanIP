package x.KenKOfficial.BanIP.Main;

import org.bukkit.plugin.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import x.KenKOfficial.BanIP.Listeners.*;
import x.KenKOfficial.BanIP.Files.*;
import org.bukkit.command.*;
import x.KenKOfficial.BanIP.Commands.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ int[] IlIl;
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ String[] IIIl;
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private static String Illll(final String lIllIlIlIllllll, final String IlIlIlIlIllllll) {
        try {
            final SecretKeySpec IIIIllIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlIlIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllIlIlIllllll = Cipher.getInstance("Blowfish");
            llllIlIlIllllll.init(Main.IlIl[2], IIIIllIlIllllll);
            return new String(llllIlIlIllllll.doFinal(Base64.getDecoder().decode(lIllIlIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllIlIlIllllll) {
            IlllIlIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIlll(final String IIIIIlIlIllllll, final String lllllIIlIllllll) {
        try {
            final SecretKeySpec llIIIlIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIlIllllll.getBytes(StandardCharsets.UTF_8)), Main.IlIl[8]), "DES");
            final Cipher IlIIIlIlIllllll = Cipher.getInstance("DES");
            IlIIIlIlIllllll.init(Main.IlIl[2], llIIIlIlIllllll);
            return new String(IlIIIlIlIllllll.doFinal(Base64.getDecoder().decode(IIIIIlIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIlIllllll) {
            lIIIIlIlIllllll.printStackTrace();
            return null;
        }
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.IIIl[Main.IlIl[6]]);
        System.out.println(Main.IIIl[Main.IlIl[7]]);
        System.out.println(Main.IIIl[Main.IlIl[8]]);
        System.out.println(Main.IIIl[Main.IlIl[9]]);
        System.out.println(Main.IIIl[Main.IlIl[10]]);
        System.out.println(Main.IIIl[Main.IlIl[11]]);
    }
    
    static {
        lIIIIl();
        IIIIIl();
    }
    
    public void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.IIIl[Main.IlIl[15]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new AsyncPlayerPreLogin(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    private static boolean IlIIIl(final int IIIllIIlIllllll, final int lllIlIIlIllllll) {
        return IIIllIIlIllllll < lllIlIIlIllllll;
    }
    
    public void registerFiles() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.IIIl[Main.IlIl[16]]).append(this.getName())));
        new FileLoader(this);
        "".length();
    }
    
    public void registerCommands() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.IIIl[Main.IlIl[12]]).append(this.getName())));
        this.getCommand(Main.IIIl[Main.IlIl[13]]).setExecutor((CommandExecutor)new BanIPCommand());
        this.getCommand(Main.IIIl[Main.IlIl[14]]).setExecutor((CommandExecutor)new UnBanIPCommand());
    }
    
    private static void IIIIIl() {
        (IIIl = new String[Main.IlIl[17]])[Main.IlIl[0]] = lIlll("ccUUT0xx7DRxxRRPTHHsNHHFFE9Mcew0ccUUT0xx7DRxxRRPTHHsNHHFFE9Mcew0ccUUT0xx7DQt+KhZO2JIOg==", "lMLsM");
        Main.IIIl[Main.IlIl[1]] = Illll("DnJ8Dnz55O1YbgyIeRrJWw==", "epOqF");
        Main.IIIl[Main.IlIl[2]] = Illll("b7lEJqprQjXJk/SDOAaMaxfd2kQqYBC+", "njpZr");
        Main.IIIl[Main.IlIl[3]] = lllll("DTk4ODgjJS0vNm0=", "LRLAO");
        Main.IIIl[Main.IlIl[4]] = lIlll("8dSI+ldzHuK5WWjOnl8zUKhA30+P4/dK+bpfnPOj8pwnf1Cqgsrdj5PtX7r8sCz8jYwzR95oxfOFEkV+paLAYw==", "eCXOZ");
        Main.IIIl[Main.IlIl[5]] = Illll("H0exZkEgAE0fR7FmQSAATR9HsWZBIABNH0exZkEgAE0fR7FmQSAATR9HsWZBIABNH0exZkEgAE0yuBhbWpTY6g==", "YQxIQ");
        Main.IIIl[Main.IlIl[6]] = Illll("pW116AMWkkqlbXXoAxaSSqVtdegDFpJKpW116AMWkkqlbXXoAxaSSqVtdegDFpJKpW116AMWkkqR0vzndiDPLg==", "stFAY");
        Main.IIIl[Main.IlIl[7]] = lllll("IQ8pCho4KgU0", "YDLdX");
        Main.IIIl[Main.IlIl[8]] = lllll("OicUKzgMeEZpfF1vJD0mDA==", "mBfXR");
        Main.IIIl[Main.IlIl[9]] = Illll("3RwAnxJMWFmEwPlbsJMSXg==", "clelb");
        Main.IIIl[Main.IlIl[10]] = lIlll("kRxZLlMSx4aA7JaZU8Vvgm879yWF8+AwzgIjlzXoxkcjN6m0QUak1pmNiZiGFsLJHnRnmMH2AxFqvHoUaRpzMA==", "qYjGG");
        Main.IIIl[Main.IlIl[11]] = Illll("7JEF5R0i0YTskQXlHSLRhOyRBeUdItGE7JEF5R0i0YTskQXlHSLRhOyRBeUdItGE7JEF5R0i0YR0J08WAfXczQ==", "WPcGB");
        Main.IIIl[Main.IlIl[12]] = lIlll("PNKgmeiDl5tddssuUeEDwK3whTF1OWVbwR8UB8Zdb0k=", "VtbjS");
        Main.IIIl[Main.IlIl[13]] = lllll("DRMbKx0=", "oruBm");
        Main.IIIl[Main.IlIl[14]] = lIlll("azGNRel4Dv0=", "XnfdO");
        Main.IIIl[Main.IlIl[15]] = lIlll("m+5FRozkRc3LhRJ0qJm/1Ki5pF06C7nJrPqs3mlAAXY=", "SUgRN");
        Main.IIIl[Main.IlIl[16]] = Illll("UfHB5NG7WULVri70Y+ji0asAchGWf0tFF/UVsIZFhqUlF9yZgD2i3Q==", "wQEre");
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        this.registerFiles();
        System.out.println(Main.IIIl[Main.IlIl[0]]);
        System.out.println(Main.IIIl[Main.IlIl[1]]);
        System.out.println(Main.IIIl[Main.IlIl[2]]);
        System.out.println(Main.IIIl[Main.IlIl[3]]);
        System.out.println(Main.IIIl[Main.IlIl[4]]);
        System.out.println(Main.IIIl[Main.IlIl[5]]);
    }
    
    private static String lllll(String lIllllIlIllllll, final String lIIIIIllIllllll) {
        lIllllIlIllllll = (short)new String(Base64.getDecoder().decode(((String)lIllllIlIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIIIIllIllllll = new StringBuilder();
        final char[] llllllIlIllllll = lIIIIIllIllllll.toCharArray();
        int IlllllIlIllllll = Main.IlIl[0];
        final char IIIlllIlIllllll = (Object)((String)lIllllIlIllllll).toCharArray();
        final int lllIllIlIllllll = IIIlllIlIllllll.length;
        String IllIllIlIllllll = (String)Main.IlIl[0];
        while (IlIIIl((int)IllIllIlIllllll, lllIllIlIllllll)) {
            final char llIIIIllIllllll = IIIlllIlIllllll[IllIllIlIllllll];
            IIIIIIllIllllll.append((char)(llIIIIllIllllll ^ llllllIlIllllll[IlllllIlIllllll % llllllIlIllllll.length]));
            "".length();
            ++IlllllIlIllllll;
            ++IllIllIlIllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(IIIIIIllIllllll);
    }
    
    private static void lIIIIl() {
        (IlIl = new int[18])[0] = ((0x6F ^ 0x70) & ~(0xAD ^ 0xB2));
        Main.IlIl[1] = " ".length();
        Main.IlIl[2] = "  ".length();
        Main.IlIl[3] = "   ".length();
        Main.IlIl[4] = (0x76 ^ 0x7F ^ (0x47 ^ 0x4A));
        Main.IlIl[5] = (0x49 ^ 0x4C);
        Main.IlIl[6] = (0x8 ^ 0x1F ^ (0x4C ^ 0x5D));
        Main.IlIl[7] = (129 + 57 - 58 + 34 ^ 73 + 162 - 96 + 26);
        Main.IlIl[8] = (154 + 150 - 204 + 58 ^ 82 + 4 + 58 + 6);
        Main.IlIl[9] = (91 + 60 - 26 + 34 ^ 111 + 64 - 95 + 70);
        Main.IlIl[10] = (0xB2 ^ 0xB8);
        Main.IlIl[11] = (88 + 64 - 131 + 112 ^ 88 + 138 - 206 + 122);
        Main.IlIl[12] = (0x23 ^ 0x74 ^ (0x31 ^ 0x6A));
        Main.IlIl[13] = (0x2E ^ 0x18 ^ (0x8F ^ 0xB4));
        Main.IlIl[14] = (107 + 59 - 106 + 129 ^ 44 + 79 - 8 + 64);
        Main.IlIl[15] = (0x6 ^ 0x13 ^ (0x57 ^ 0x4D));
        Main.IlIl[16] = (37 + 8 + 3 + 82 ^ 83 + 6 + 8 + 49);
        Main.IlIl[17] = (0x67 ^ 0x76);
    }
}
