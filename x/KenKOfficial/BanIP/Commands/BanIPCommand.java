package x.KenKOfficial.BanIP.Commands;

import java.util.regex.*;
import java.nio.charset.*;
import org.bukkit.command.*;
import x.KenKOfficial.BanIP.Utils.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import x.KenKOfficial.BanIP.Apis.*;
import x.KenKOfficial.BanIP.Main.*;
import java.util.*;

public class BanIPCommand implements CommandExecutor
{
    private static final /* synthetic */ String banip_usage;
    private static final /* synthetic */ String[] lIIl;
    private static final /* synthetic */ int[] IIll;
    private static final /* synthetic */ String prefix;
    private static final /* synthetic */ String brak_permisji;
    public static final /* synthetic */ Pattern ipValidity;
    
    private static boolean llIlIl(final int IIllIlIIIllllll) {
        return IIllIlIIIllllll == 0;
    }
    
    private static boolean IIllIl(final int llIIllIIIllllll, final int IlIIllIIIllllll) {
        return llIIllIIIllllll < IlIIllIIIllllll;
    }
    
    private static String llIIIl(String llIlIIlIIllllll, final String IlIlIIlIIllllll) {
        llIlIIlIIllllll = (boolean)new String(Base64.getDecoder().decode(((String)llIlIIlIIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlllIIlIIllllll = new StringBuilder();
        final char[] lIllIIlIIllllll = IlIlIIlIIllllll.toCharArray();
        int IIllIIlIIllllll = BanIPCommand.IIll[0];
        final String IllIIIlIIllllll = (Object)((String)llIlIIlIIllllll).toCharArray();
        final int lIlIIIlIIllllll = IllIIIlIIllllll.length;
        float IIlIIIlIIllllll = BanIPCommand.IIll[0];
        while (IIllIl((int)IIlIIIlIIllllll, lIlIIIlIIllllll)) {
            final char lIIIlIlIIllllll = IllIIIlIIllllll[IIlIIIlIIllllll];
            IlllIIlIIllllll.append((char)(lIIIlIlIIllllll ^ lIllIIlIIllllll[IIllIIlIIllllll % lIllIIlIIllllll.length]));
            "".length();
            ++IIllIIlIIllllll;
            ++IIlIIIlIIllllll;
            "".length();
            if (((0x7A ^ 0x5D) & ~(0xE4 ^ 0xC3)) != ((0x94 ^ 0x83) & ~(0xB7 ^ 0xA0))) {
                return null;
            }
        }
        return String.valueOf(IlllIIlIIllllll);
    }
    
    private static void IlIlIl() {
        (IIll = new int[22])[0] = ((0xDA ^ 0x8B ^ (0x61 ^ 0x36)) & (0xA3 ^ 0xAD ^ (0x1E ^ 0x16) ^ -" ".length()));
        BanIPCommand.IIll[1] = " ".length();
        BanIPCommand.IIll[2] = "  ".length();
        BanIPCommand.IIll[3] = "   ".length();
        BanIPCommand.IIll[4] = (0x2B ^ 0x2F);
        BanIPCommand.IIll[5] = (129 + 41 - 28 + 44 ^ 103 + 116 - 49 + 21);
        BanIPCommand.IIll[6] = (0xC ^ 0x6B ^ (0x7E ^ 0x1F));
        BanIPCommand.IIll[7] = (0x3B ^ 0x3C);
        BanIPCommand.IIll[8] = (0xCE ^ 0xC6);
        BanIPCommand.IIll[9] = (0xAC ^ 0xA5);
        BanIPCommand.IIll[10] = (0x5C ^ 0x56);
        BanIPCommand.IIll[11] = (0x7F ^ 0x74);
        BanIPCommand.IIll[12] = (0x5F ^ 0x36 ^ (0x46 ^ 0x23));
        BanIPCommand.IIll[13] = (0x42 ^ 0x4F);
        BanIPCommand.IIll[14] = (0x4D ^ 0x43);
        BanIPCommand.IIll[15] = (0x3 ^ 0xC);
        BanIPCommand.IIll[16] = (56 + 54 - 60 + 95 ^ 64 + 71 - 40 + 34);
        BanIPCommand.IIll[17] = (0x1D ^ 0xC);
        BanIPCommand.IIll[18] = (73 + 77 - 123 + 102 ^ 31 + 64 + 13 + 39);
        BanIPCommand.IIll[19] = (0x9A ^ 0x89);
        BanIPCommand.IIll[20] = (0xD1 ^ 0xC5);
        BanIPCommand.IIll[21] = (0xA3 ^ 0xB6);
    }
    
    public boolean onCommand(final CommandSender IlIlIIIlIllllll, final Command lIIlIIIlIllllll, final String IIIlIIIlIllllll, final String[] IlIIIIIlIllllll) {
        if (llIlIl(IlIlIIIlIllllll.hasPermission(BanIPCommand.lIIl[BanIPCommand.IIll[0]]) ? 1 : 0)) {
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BanIPCommand.prefix).append(BanIPCommand.lIIl[BanIPCommand.IIll[1]]).append(BanIPCommand.brak_permisji))));
            return BanIPCommand.IIll[0] != 0;
        }
        if (IIllIl(IlIIIIIlIllllll.length, BanIPCommand.IIll[1])) {
            IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BanIPCommand.prefix).append(BanIPCommand.lIIl[BanIPCommand.IIll[2]]).append(BanIPCommand.banip_usage))));
            return BanIPCommand.IIll[0] != 0;
        }
        final StringBuilder IllIIIIlIllllll = new StringBuilder();
        int lIllIIIlIllllll = BanIPCommand.IIll[1];
        while (IIllIl(lIllIIIlIllllll, IlIIIIIlIllllll.length)) {
            IllIIIIlIllllll.append(IlIIIIIlIllllll[lIllIIIlIllllll]).append(BanIPCommand.lIIl[BanIPCommand.IIll[3]]);
            "".length();
            ++lIllIIIlIllllll;
            "".length();
            if ("   ".length() > "   ".length()) {
                return ((152 + 67 - 177 + 142 ^ 63 + 110 - 110 + 68) & (136 + 85 - 213 + 142 ^ 148 + 129 - 251 + 147 ^ -" ".length())) != 0x0;
            }
        }
        final String lIlIIIIlIllllll = String.valueOf(IllIIIIlIllllll);
        if (lIllIl(BanIPCommand.ipValidity.matcher(IlIIIIIlIllllll[BanIPCommand.IIll[0]]).matches() ? 1 : 0)) {
            this.processIPBan(IlIIIIIlIllllll[BanIPCommand.IIll[0]], IlIlIIIlIllllll, lIlIIIIlIllllll);
            "".length();
            if (((160 + 102 - 131 + 109 ^ 156 + 1 - 77 + 101) & (191 + 105 - 229 + 156 ^ 84 + 120 - 88 + 38 ^ -" ".length())) > (0x2D ^ 0x2A ^ "   ".length())) {
                return ((87 + 87 - 51 + 18 ^ 59 + 83 - 65 + 84) & (0x2E ^ 0x9 ^ (0xBB ^ 0xB0) ^ -" ".length())) != 0x0;
            }
        }
        else {
            final Player IIllIIIlIllllll = Bukkit.getPlayer(IlIIIIIlIllllll[BanIPCommand.IIll[0]]);
            if (IlllIl(IIllIIIlIllllll)) {
                IlIlIIIlIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BanIPCommand.prefix).append(BanIPCommand.lIIl[BanIPCommand.IIll[4]]).append(BanIPCommand.banip_usage))));
            }
            this.processIPBan(IIllIIIlIllllll.getAddress().getAddress().getHostAddress(), IlIlIIIlIllllll, lIlIIIIlIllllll);
        }
        return BanIPCommand.IIll[0] != 0;
    }
    
    private static String IIlIIl(final String llIlllIIIllllll, final String IlIlllIIIllllll) {
        try {
            final SecretKeySpec IlllllIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIlllIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIllllIIIllllll = Cipher.getInstance("Blowfish");
            lIllllIIIllllll.init(BanIPCommand.IIll[2], IlllllIIIllllll);
            return new String(lIllllIIIllllll.doFinal(Base64.getDecoder().decode(llIlllIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllllIIIllllll) {
            IIllllIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IlllIl(final Object IIIIllIIIllllll) {
        return IIIIllIIIllllll == null;
    }
    
    private void processIPBan(final String IlIIlllIIllllll, final CommandSender lIIIlllIIllllll, final String IIIIlllIIllllll) {
        API.setBanIP(IlIIlllIIllllll, lIIIlllIIllllll.getName(), IIIIlllIIllllll);
        final int llIlIllIIllllll = (int)Bukkit.getOnlinePlayers().iterator();
        while (lIllIl(((Iterator)llIlIllIIllllll).hasNext() ? 1 : 0)) {
            final Player IllIlllIIllllll = ((Iterator<Player>)llIlIllIIllllll).next();
            if (lIllIl(IllIlllIIllllll.getAddress().getAddress().getHostAddress().equals(IlIIlllIIllllll) ? 1 : 0)) {
                final String lllIlllIIllllll = Main.getPlugin().getConfig().getString(BanIPCommand.lIIl[BanIPCommand.IIll[5]]).replace(BanIPCommand.lIIl[BanIPCommand.IIll[6]], IIIIlllIIllllll);
                IllIlllIIllllll.kickPlayer(ChatUtil.fixColor(lllIlllIIllllll));
            }
            "".length();
            if (((0x94 ^ 0xC7) & ~(0x10 ^ 0x43)) != 0x0) {
                return;
            }
        }
        final String llllIllIIllllll = Main.getPlugin().getConfig().getString(BanIPCommand.lIIl[BanIPCommand.IIll[7]]).replace(BanIPCommand.lIIl[BanIPCommand.IIll[8]], IlIIlllIIllllll);
        lIIIlllIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BanIPCommand.prefix).append(BanIPCommand.lIIl[BanIPCommand.IIll[9]]).append(llllIllIIllllll))));
        final short IlIlIllIIllllll = (short)Bukkit.getOnlinePlayers().iterator();
        while (lIllIl(((Iterator)IlIlIllIIllllll).hasNext() ? 1 : 0)) {
            final Player IIlIlllIIllllll = ((Iterator<Player>)IlIlIllIIllllll).next();
            if (lIllIl(IIlIlllIIllllll.hasPermission(BanIPCommand.lIIl[BanIPCommand.IIll[10]]) ? 1 : 0)) {
                final String lIlIlllIIllllll = Main.getPlugin().getConfig().getString(BanIPCommand.lIIl[BanIPCommand.IIll[11]]).replace(BanIPCommand.lIIl[BanIPCommand.IIll[12]], lIIIlllIIllllll.getName()).replace(BanIPCommand.lIIl[BanIPCommand.IIll[13]], IlIIlllIIllllll);
                IIlIlllIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BanIPCommand.prefix).append(BanIPCommand.lIIl[BanIPCommand.IIll[14]]).append(lIlIlllIIllllll))));
            }
            "".length();
            if ((88 + 92 - 179 + 149 ^ 90 + 90 - 86 + 52) == 0x0) {
                return;
            }
        }
        Bukkit.getConsoleSender().sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(BanIPCommand.lIIl[BanIPCommand.IIll[15]]).append(lIIIlllIIllllll.getName()).append(BanIPCommand.lIIl[BanIPCommand.IIll[16]]).append(IlIIlllIIllllll))));
    }
    
    private static String lIlIIl(final String IIIIIllIIllllll, final String lllllIlIIllllll) {
        try {
            final SecretKeySpec llIIIllIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIlIIllllll.getBytes(StandardCharsets.UTF_8)), BanIPCommand.IIll[8]), "DES");
            final Cipher IlIIIllIIllllll = Cipher.getInstance("DES");
            IlIIIllIIllllll.init(BanIPCommand.IIll[2], llIIIllIIllllll);
            return new String(IlIIIllIIllllll.doFinal(Base64.getDecoder().decode(IIIIIllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIllIIllllll) {
            lIIIIllIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIl(final int IlllIlIIIllllll) {
        return IlllIlIIIllllll != 0;
    }
    
    static {
        IlIlIl();
        lIIlIl();
        prefix = Main.getPlugin().getConfig().getString(BanIPCommand.lIIl[BanIPCommand.IIll[17]]);
        brak_permisji = Main.getPlugin().getConfig().getString(BanIPCommand.lIIl[BanIPCommand.IIll[18]]);
        banip_usage = Main.getPlugin().getConfig().getString(BanIPCommand.lIIl[BanIPCommand.IIll[19]]);
        ipValidity = Pattern.compile(BanIPCommand.lIIl[BanIPCommand.IIll[20]]);
    }
    
    private static void lIIlIl() {
        (lIIl = new String[BanIPCommand.IIll[21]])[BanIPCommand.IIll[0]] = llIIIl("Hz4iJA8GOy46QwYxKiMDSTcmJAQX", "gUGJm");
        BanIPCommand.lIIl[BanIPCommand.IIll[1]] = IIlIIl("yST9ees7Df0=", "bEkRK");
        BanIPCommand.lIIl[BanIPCommand.IIll[2]] = lIlIIl("P/qBjiShrvo=", "bgAdO");
        BanIPCommand.lIIl[BanIPCommand.IIll[3]] = lIlIIl("Sv0UUxypP4M=", "WFmwC");
        BanIPCommand.lIIl[BanIPCommand.IIll[4]] = IIlIIl("oPrlKg2Pg8Y=", "HYsEZ");
        BanIPCommand.lIIl[BanIPCommand.IIll[5]] = lIlIIl("YTlomXm5jl5cfblKkbwahYesa4GUFYlmWMgapLS2wK8=", "viZAb");
        BanIPCommand.lIIl[BanIPCommand.IIll[6]] = IIlIIl("W/TdJK9WS9c=", "gqlZR");
        BanIPCommand.lIIl[BanIPCommand.IIll[7]] = lIlIIl("hT1ERGq6/YILFk7diA0iRDd5GVsuyZtY", "dsFhG");
        BanIPCommand.lIIl[BanIPCommand.IIll[8]] = IIlIIl("bMe8n++Uycc=", "JFzyh");
        BanIPCommand.lIIl[BanIPCommand.IIll[9]] = lIlIIl("thSpws9Kofs=", "OLqca");
        BanIPCommand.lIIl[BanIPCommand.IIll[10]] = llIIIl("CjgmNhETPSooXRM3LjEdXDEiNhoC", "rSCXs");
        BanIPCommand.lIIl[BanIPCommand.IIll[11]] = lIlIIl("U4Dt2WChvM64+RVP/oz2qO2tm+TVsjErKYYFbbU61Ic=", "wZYvw");
        BanIPCommand.lIIl[BanIPCommand.IIll[12]] = lIlIIl("t0f1E4wd+zs=", "qiifE");
        BanIPCommand.lIIl[BanIPCommand.IIll[13]] = lIlIIl("q/6J1r2WMUA=", "xFuOp");
        BanIPCommand.lIIl[BanIPCommand.IIll[14]] = IIlIIl("bpVLFHW7Vo8=", "FxNkx");
        BanIPCommand.lIIl[BanIPCommand.IIll[15]] = llIIIl("TUx0CFVVVHRTKg8ZOwoCGAAgBR8EBnRcUUtSMA==", "ktRdk");
        BanIPCommand.lIIl[BanIPCommand.IIll[16]] = llIIIl("SE1+HAQJBSYRBwRLADZAUFFpQAU=", "hkIff");
        BanIPCommand.lIIl[BanIPCommand.IIll[17]] = IIlIIl("VOTYtKSPd2I=", "RmHCn");
        BanIPCommand.lIIl[BanIPCommand.IIll[18]] = llIIIl("JRMLEj03BBgUCzQLAw==", "Gajyb");
        BanIPCommand.lIIl[BanIPCommand.IIll[19]] = llIIIl("KBYLHQAVAh8NEyMS", "Jwetp");
        BanIPCommand.lIIl[BanIPCommand.IIll[20]] = IIlIIl("zEW79ZD/AKnOjdXytC1QxXzXgpAnbS3kp2ZQYCO2dy0iG0xYOTi4ROF1BPoq2N5CdiQ7EN+ej5XtxBopyOfzbi7iR8FqVF4BSyiJznORQzw8HLVM8YWLB6EXt4eDQeT3b6OCIZxxy9MNGFTmqj88u+JZiQCZvMIJWeNIXztBt7E=", "IsLew");
    }
}
