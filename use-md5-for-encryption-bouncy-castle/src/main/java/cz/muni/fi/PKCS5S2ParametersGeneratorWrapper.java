package cz.muni.fi;

import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;

public class PKCS5S2ParametersGeneratorWrapper {

    public static byte[] digestSha512(byte[] input) {
        SHA512Digest digest = new SHA512Digest();
        PKCS5S2ParametersGenerator generator = new PKCS5S2ParametersGenerator(digest);
        generator.init(input, new byte[0], 1);
        KeyParameter keyParameter = (KeyParameter) generator
                .generateDerivedParameters(512);
        return keyParameter.getKey();
    }

    public static byte[] digestMd5(byte[] input) {
        MD5Digest digest = new MD5Digest();
        PKCS5S2ParametersGenerator generator = new PKCS5S2ParametersGenerator(digest);
        generator.init(input, new byte[0], 1);
        KeyParameter keyParameter = (KeyParameter) generator
                .generateDerivedParameters(64);
        return keyParameter.getKey();
    }
}