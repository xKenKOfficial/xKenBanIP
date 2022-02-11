package x.KenKOfficial.BanIP.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.BanIP.Main.*;
import x.KenKOfficial.BanIP.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ String[] IIl;
    private static final /* synthetic */ int[] lIl;
    
    private static void IIIIl() {
        (IIl = new String[PlayerJoin.lIl[13]])[PlayerJoin.lIl[0]] = lIll("DsvfOseOHTQet5T3S51dIA==", "NdmWs");
        PlayerJoin.IIl[PlayerJoin.lIl[1]] = lIll("HR1TG+G9or4Emj+SC8ajbLZf1vFBvazV", "qcogB");
        PlayerJoin.IIl[PlayerJoin.lIl[2]] = lIll("eOioNrAJc6xfmBkauvRfd+8Q90B5gx32AHrdebcJlgP4K41tIR9utO9PWUdUBhfW", "FyPRY");
        PlayerJoin.IIl[PlayerJoin.lIl[3]] = Illl("EQBFE4eYV4o=", "kfflm");
        PlayerJoin.IIl[PlayerJoin.lIl[4]] = llll("VWJNNhwHNxAAX01+WkcbRGpKTDsQMBs=", "uDzay");
        PlayerJoin.IIl[PlayerJoin.lIl[5]] = lIll("yqa2UY2W8F4=", "nFwtK");
        PlayerJoin.IIl[PlayerJoin.lIl[6]] = lIll("Nwm7UQK1WtiH6Kc/kpreKPjLtF5+OVwd6m9jmB9L/Us=", "WTfvT");
        PlayerJoin.IIl[PlayerJoin.lIl[7]] = lIll("0wvaDLQq1xI=", "Mdpxr");
        PlayerJoin.IIl[PlayerJoin.lIl[8]] = llll("bGp6HBk/LyIqFGp0d3hWLiQ5LAA/dmJ3FCU/LjcCKGIqP19+BAktKj4JCwwX", "LLMXp");
        PlayerJoin.IIl[PlayerJoin.lIl[9]] = Illl("yKsWu7YlQTY=", "NGnUC");
        PlayerJoin.IIl[PlayerJoin.lIl[10]] = lIll("bpd190sn2CwpBt6rLRCqiv/C9lJmeM7VjoKuVOedWtujXt8ZfeUpV4EK5idy0FRM", "ZjrJx");
        PlayerJoin.IIl[PlayerJoin.lIl[11]] = Illl("IV3fNZTA6Ss=", "EpmKr");
        PlayerJoin.IIl[PlayerJoin.lIl[12]] = Illl("YEZzfE4TB6AD/sbdJtN34nX0s7vcoCAuuXFksw+BOxuPPzZOC11w93OAXjJsLJ9N", "XRvGz");
    }
    
    private static String Illl(final String llIllIlIlllllll, final String IIlllIlIlllllll) {
        try {
            final SecretKeySpec IIIIIllIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlllIlIlllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.lIl[8]), "DES");
            final Cipher lllllIlIlllllll = Cipher.getInstance("DES");
            lllllIlIlllllll.init(PlayerJoin.lIl[2], IIIIIllIlllllll);
            return new String(lllllIlIlllllll.doFinal(Base64.getDecoder().decode(llIllIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllllIlIlllllll) {
            IllllIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIll(final String IlllIIlIlllllll, final String llllIIlIlllllll) {
        try {
            final SecretKeySpec llIIlIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIIlIlIlllllll = Cipher.getInstance("Blowfish");
            IlIIlIlIlllllll.init(PlayerJoin.lIl[2], llIIlIlIlllllll);
            return new String(IlIIlIlIlllllll.doFinal(Base64.getDecoder().decode(IlllIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIlIlllllll) {
            lIIIlIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIl();
        IIIIl();
    }
    
    private static boolean IlIIl(final int lIllIlIIlllllll) {
        return lIllIlIIlllllll != 0;
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IIIlIllIlllllll) {
        final Player lllIIllIlllllll = IIIlIllIlllllll.getPlayer();
        if (IlIIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.IIl[PlayerJoin.lIl[0]]) ? 1 : 0) && IlIIl(lllIIllIlllllll.hasPermission(PlayerJoin.IIl[PlayerJoin.lIl[1]]) ? 1 : 0)) {
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[2]]));
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[3]]));
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[4]]));
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[5]]));
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[6]]));
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[7]]));
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[8]]));
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[9]]));
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[10]]));
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[11]]));
            lllIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[12]]));
        }
    }
    
    private static void lIIIl() {
        (lIl = new int[14])[0] = ((0x9C ^ 0xA3) & ~(0xF ^ 0x30));
        PlayerJoin.lIl[1] = " ".length();
        PlayerJoin.lIl[2] = "  ".length();
        PlayerJoin.lIl[3] = "   ".length();
        PlayerJoin.lIl[4] = (0x50 ^ 0x54);
        PlayerJoin.lIl[5] = (0x5C ^ 0x10 ^ (0xFF ^ 0xB6));
        PlayerJoin.lIl[6] = (0x6F ^ 0x3E ^ (0xD ^ 0x5A));
        PlayerJoin.lIl[7] = (0xB8 ^ 0xBF);
        PlayerJoin.lIl[8] = (0x7C ^ 0x74);
        PlayerJoin.lIl[9] = (0xCA ^ 0xC3);
        PlayerJoin.lIl[10] = (0x67 ^ 0x56 ^ (0x97 ^ 0xAC));
        PlayerJoin.lIl[11] = (0x71 ^ 0x7A);
        PlayerJoin.lIl[12] = (0x89 ^ 0x85);
        PlayerJoin.lIl[13] = (0x13 ^ 0x55 ^ (0x1C ^ 0x57));
    }
    
    private static boolean llIIl(final int IIIIllIIlllllll, final int llllIlIIlllllll) {
        return IIIIllIIlllllll < llllIlIIlllllll;
    }
    
    private static String llll(String llIlllIIlllllll, final String llllllIIlllllll) {
        llIlllIIlllllll = new String(Base64.getDecoder().decode(llIlllIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlllllIIlllllll = new StringBuilder();
        final char[] lIllllIIlllllll = llllllIIlllllll.toCharArray();
        int IIllllIIlllllll = PlayerJoin.lIl[0];
        final byte IllIllIIlllllll = (Object)llIlllIIlllllll.toCharArray();
        final Exception lIlIllIIlllllll = (Exception)IllIllIIlllllll.length;
        long IIlIllIIlllllll = PlayerJoin.lIl[0];
        while (llIIl((int)IIlIllIIlllllll, (int)lIlIllIIlllllll)) {
            final char lIIIIIlIlllllll = IllIllIIlllllll[IIlIllIIlllllll];
            IlllllIIlllllll.append((char)(lIIIIIlIlllllll ^ lIllllIIlllllll[IIllllIIlllllll % lIllllIIlllllll.length]));
            "".length();
            ++IIllllIIlllllll;
            ++IIlIllIIlllllll;
            "".length();
            if ((0x7F ^ 0x7B) == 0x0) {
                return null;
            }
        }
        return String.valueOf(IlllllIIlllllll);
    }
}
