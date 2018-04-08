

import java.security.*;
import java.util.Base64;
import java.io.*;

public class Keys {

	public void getKeyParByte(String algorithm, int size) throws NoSuchAlgorithmException, NoSuchProviderException {
		KeyPairGenerator generator = KeyPairGenerator.getInstance(algorithm);
		generator.initialize(size);
		byte[] publicKey = generator.genKeyPair().getPublic().getEncoded();
		byte[] privateKey = generator.genKeyPair().getPrivate().getEncoded();
		
		Base64.Encoder encoder = Base64.getEncoder();

		try(Writer out = new FileWriter(path + ".key")){
			out.write(algorithm + "PRIVATE\n");
			out.write(encoder.encodeToString(privateKey));
			out.write(algorithm + "PRIVATE END\n");
			out.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		try(Writer out = new FileWriter(path + ".pub")){
			out.write(algorithm + "PUBLIC\n");
			out.write(encoder.encodeToString(publicKey));
			out.write(algorithm + "PUBLIC END\n");
			out.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private final String path = "." + File.separator + "key";
}
