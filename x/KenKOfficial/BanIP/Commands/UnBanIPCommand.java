package x.KenKOfficial.BanIP.Commands;

import org.bukkit.command.*;
import x.KenKOfficial.BanIP.Utils.*;
import x.KenKOfficial.BanIP.Apis.*;
import x.KenKOfficial.BanIP.Main.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class UnBanIPCommand implements CommandExecutor
{
    private static final /* synthetic */ String unbanip_usage;
    private static final /* synthetic */ String[] Ill;
    private static final /* synthetic */ String brak_permisji;
    private static final /* synthetic */ String prefix;
    private static final /* synthetic */ int[] lll;
    
    public boolean onCommand(final CommandSender lllllIIIlllllll, final Command IlIIIlIIlllllll, final String lIIIIlIIlllllll, final String[] IllllIIIlllllll) {
        if (lIIll(lllllIIIlllllll.hasPermission(UnBanIPCommand.Ill[UnBanIPCommand.lll[0]]) ? 1 : 0)) {
            lllllIIIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(UnBanIPCommand.prefix).append(UnBanIPCommand.Ill[UnBanIPCommand.lll[1]]).append(UnBanIPCommand.brak_permisji))));
            return UnBanIPCommand.lll[0] != 0;
        }
        if (IlIll(IllllIIIlllllll.length, UnBanIPCommand.lll[1])) {
            lllllIIIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(UnBanIPCommand.prefix).append(UnBanIPCommand.Ill[UnBanIPCommand.lll[2]]).append(UnBanIPCommand.unbanip_usage))));
            return UnBanIPCommand.lll[0] != 0;
        }
        if (llIll(IllllIIIlllllll.length, UnBanIPCommand.lll[1])) {
            if (IIlll(BanIPCommand.ipValidity.matcher(IllllIIIlllllll[UnBanIPCommand.lll[0]]).matches() ? 1 : 0)) {
                API.setUnbanIP(IllllIIIlllllll[UnBanIPCommand.lll[0]]);
                final String IllIIlIIlllllll = Main.getPlugin().getConfig().getString(UnBanIPCommand.Ill[UnBanIPCommand.lll[3]]).replace(UnBanIPCommand.Ill[UnBanIPCommand.lll[4]], IllllIIIlllllll[UnBanIPCommand.lll[0]]);
                lllllIIIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(UnBanIPCommand.prefix).append(UnBanIPCommand.Ill[UnBanIPCommand.lll[5]]).append(IllIIlIIlllllll))));
                "".length();
                if (((0x79 ^ 0x6B) & ~(0x6A ^ 0x78)) > 0) {
                    return ("  ".length() & ~"  ".length()) != 0x0;
                }
            }
            else {
                final String lIlIIlIIlllllll = Main.getPlugin().getConfig().getString(UnBanIPCommand.Ill[UnBanIPCommand.lll[6]]);
                lllllIIIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(UnBanIPCommand.prefix).append(UnBanIPCommand.Ill[UnBanIPCommand.lll[7]]).append(lIlIIlIIlllllll))));
            }
        }
        return UnBanIPCommand.lll[0] != 0;
    }
    
    private static String IllIl(final String IIIlIIIIlllllll, final String lllIIIIIlllllll) {
        try {
            final SecretKeySpec llIlIIIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIlIIIIlllllll = Cipher.getInstance("Blowfish");
            IlIlIIIIlllllll.init(UnBanIPCommand.lll[2], llIlIIIIlllllll);
            return new String(IlIlIIIIlllllll.doFinal(Base64.getDecoder().decode(IIIlIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIIIlllllll) {
            lIIlIIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIl(final String llIIlIIIlllllll, final String IIlIlIIIlllllll) {
        try {
            final SecretKeySpec IIIllIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlIlIIIlllllll.getBytes(StandardCharsets.UTF_8)), UnBanIPCommand.lll[8]), "DES");
            final Cipher lllIlIIIlllllll = Cipher.getInstance("DES");
            lllIlIIIlllllll.init(UnBanIPCommand.lll[2], IIIllIIIlllllll);
            return new String(lllIlIIIlllllll.doFinal(Base64.getDecoder().decode(llIIlIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIlIIIlllllll) {
            IllIlIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIll(final int IIIlIlllIllllll, final int lllIIlllIllllll) {
        return IIIlIlllIllllll == lllIIlllIllllll;
    }
    
    private static boolean lIIll(final int lllllIllIllllll) {
        return lllllIllIllllll == 0;
    }
    
    static {
        IIIll();
        lllIl();
        prefix = Main.getPlugin().getConfig().getString(UnBanIPCommand.Ill[UnBanIPCommand.lll[8]]);
        brak_permisji = Main.getPlugin().getConfig().getString(UnBanIPCommand.Ill[UnBanIPCommand.lll[9]]);
        unbanip_usage = Main.getPlugin().getConfig().getString(UnBanIPCommand.Ill[UnBanIPCommand.lll[10]]);
    }
    
    private static boolean IlIll(final int IIlIIlllIllllll, final int llIIIlllIllllll) {
        return IIlIIlllIllllll < llIIIlllIllllll;
    }
    
    private static void lllIl() {
        (Ill = new String[UnBanIPCommand.lll[11]])[UnBanIPCommand.lll[0]] = IIlIl("HjsJGgMHPgUETwc0AR0PSCUCFgAIORw=", "fPlta");
        UnBanIPCommand.Ill[UnBanIPCommand.lll[1]] = IIlIl("ag==", "JOAsr");
        UnBanIPCommand.Ill[UnBanIPCommand.lll[2]] = IIlIl("aA==", "HcoLf");
        UnBanIPCommand.Ill[UnBanIPCommand.lll[3]] = lIlIl("pfmrrqu+3c6TwNbnKau4hA==", "DnDUj");
        UnBanIPCommand.Ill[UnBanIPCommand.lll[4]] = IllIl("fWshui/kxdc=", "SngRd");
        UnBanIPCommand.Ill[UnBanIPCommand.lll[5]] = IIlIl("dg==", "VdIFJ");
        UnBanIPCommand.Ill[UnBanIPCommand.lll[6]] = lIlIl("dV+Ru9AOFQg1PsvCovD65g==", "rwrTd");
        UnBanIPCommand.Ill[UnBanIPCommand.lll[7]] = IIlIl("cg==", "RBTPn");
        UnBanIPCommand.Ill[UnBanIPCommand.lll[8]] = IIlIl("CSYqLxwB", "yTOIu");
        UnBanIPCommand.Ill[UnBanIPCommand.lll[9]] = IIlIl("DTYPBBwfIRwCKhwuBw==", "oDnoC");
        UnBanIPCommand.Ill[UnBanIPCommand.lll[10]] = IIlIl("IQUqBAE9GxcQFS0IIQA=", "TkHeo");
    }
    
    private static String IIlIl(String llIIllllIllllll, final String lllIllllIllllll) {
        llIIllllIllllll = (char)new String(Base64.getDecoder().decode(((String)llIIllllIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllIllllIllllll = new StringBuilder();
        final char[] lIlIllllIllllll = lllIllllIllllll.toCharArray();
        int IIlIllllIllllll = UnBanIPCommand.lll[0];
        final String IlllIlllIllllll = (Object)((String)llIIllllIllllll).toCharArray();
        final Exception lIllIlllIllllll = (Exception)IlllIlllIllllll.length;
        boolean IIllIlllIllllll = UnBanIPCommand.lll[0] != 0;
        while (IlIll(IIllIlllIllllll ? 1 : 0, (int)lIllIlllIllllll)) {
            final char lIIlllllIllllll = IlllIlllIllllll[IIllIlllIllllll];
            IllIllllIllllll.append((char)(lIIlllllIllllll ^ lIlIllllIllllll[IIlIllllIllllll % lIlIllllIllllll.length]));
            "".length();
            ++IIlIllllIllllll;
            ++IIllIlllIllllll;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(IllIllllIllllll);
    }
    
    private static boolean IIlll(final int lIIIIlllIllllll) {
        return lIIIIlllIllllll != 0;
    }
    
    private static void IIIll() {
        (lll = new int[12])[0] = ((0xC2 ^ 0x90 ^ (0xA3 ^ 0xB6)) & (33 + 100 + 15 + 46 ^ 61 + 1 - 23 + 94 ^ -" ".length()));
        UnBanIPCommand.lll[1] = " ".length();
        UnBanIPCommand.lll[2] = "  ".length();
        UnBanIPCommand.lll[3] = "   ".length();
        UnBanIPCommand.lll[4] = (0x3B ^ 0x6C ^ (0x5A ^ 0x9));
        UnBanIPCommand.lll[5] = (95 + 58 - 98 + 99 ^ 41 + 26 + 80 + 12);
        UnBanIPCommand.lll[6] = (0xB6 ^ 0xB0);
        UnBanIPCommand.lll[7] = (123 + 39 - 14 + 7 ^ 33 + 113 - 47 + 57);
        UnBanIPCommand.lll[8] = (7 + 26 + 15 + 92 ^ 26 + 9 + 39 + 58);
        UnBanIPCommand.lll[9] = (168 + 51 - 94 + 58 ^ 11 + 122 - 53 + 110);
        UnBanIPCommand.lll[10] = (0x2B ^ 0x3 ^ (0xAA ^ 0x88));
        UnBanIPCommand.lll[11] = (0x3D ^ 0x36);
    }
}
