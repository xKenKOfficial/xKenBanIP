package x.KenKOfficial.BanIP.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ String[] llIl;
    private static final /* synthetic */ int[] lIll;
    
    static {
        llllIl();
        IIIlIl();
    }
    
    public static String fixColor(final String IllIIlIIIllllll) {
        return IllIIlIIIllllll.replaceAll(ChatUtil.llIl[ChatUtil.lIll[0]], ChatUtil.llIl[ChatUtil.lIll[1]]).replace(ChatUtil.llIl[ChatUtil.lIll[2]], ChatUtil.llIl[ChatUtil.lIll[3]]).replace(ChatUtil.llIl[ChatUtil.lIll[4]], ChatUtil.llIl[ChatUtil.lIll[5]]).replace(ChatUtil.llIl[ChatUtil.lIll[6]], ChatUtil.llIl[ChatUtil.lIll[7]]);
    }
    
    private static void IIIlIl() {
        (llIl = new String[ChatUtil.lIll[8]])[ChatUtil.lIll[0]] = IllIIl("lJ8NIZcaFlI=", "AXAxl");
        ChatUtil.llIl[ChatUtil.lIll[1]] = lllIIl("SXkIZ01HOjc=", "iebWN");
        ChatUtil.llIl[ChatUtil.lIll[2]] = lllIIl("O5KtWGxR/Aw=", "nLemD");
        ChatUtil.llIl[ChatUtil.lIll[3]] = lllIIl("6u1MpQ4srhw=", "KGuqM");
        ChatUtil.llIl[ChatUtil.lIll[4]] = IllIIl("yON7DrU5jok=", "GtTra");
        ChatUtil.llIl[ChatUtil.lIll[5]] = IllIIl("0kcMn4Uf9rE=", "mrcSd");
        ChatUtil.llIl[ChatUtil.lIll[6]] = IllIIl("r/ao9YEgfhc=", "vfPIn");
        ChatUtil.llIl[ChatUtil.lIll[7]] = lllIIl("+9QxtskX4UU=", "Ylefx");
    }
    
    private static void llllIl() {
        (lIll = new int[9])[0] = ((0x7B ^ 0x64) & ~(0x97 ^ 0x88));
        ChatUtil.lIll[1] = " ".length();
        ChatUtil.lIll[2] = "  ".length();
        ChatUtil.lIll[3] = "   ".length();
        ChatUtil.lIll[4] = (98 + 64 - 111 + 118 ^ 86 + 119 - 201 + 169);
        ChatUtil.lIll[5] = (0x1A ^ 0x4 ^ (0x88 ^ 0x93));
        ChatUtil.lIll[6] = (0x9D ^ 0x9B);
        ChatUtil.lIll[7] = (0xF ^ 0x66 ^ (0xCF ^ 0xA1));
        ChatUtil.lIll[8] = (82 + 109 - 70 + 51 ^ 134 + 28 - 32 + 34);
    }
    
    private static String lllIIl(final String IllllIIIIllllll, final String llIllIIIIllllll) {
        try {
            final SecretKeySpec lIIIIlIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIIIllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lIll[8]), "DES");
            final Cipher IIIIIlIIIllllll = Cipher.getInstance("DES");
            IIIIIlIIIllllll.init(ChatUtil.lIll[2], lIIIIlIIIllllll);
            return new String(IIIIIlIIIllllll.doFinal(Base64.getDecoder().decode(IllllIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIIIllllll) {
            lllllIIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String IllIIl(final String lIIIlIIIIllllll, final String IlllIIIIIllllll) {
        try {
            final SecretKeySpec IIlIlIIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllIIIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIIlIIIIllllll = Cipher.getInstance("Blowfish");
            llIIlIIIIllllll.init(ChatUtil.lIll[2], IIlIlIIIIllllll);
            return new String(llIIlIIIIllllll.doFinal(Base64.getDecoder().decode(lIIIlIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIlIIIIllllll) {
            IlIIlIIIIllllll.printStackTrace();
            return null;
        }
    }
}
