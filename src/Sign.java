

import java.security.*;
import java.util.Base64;
import java.io.*;

public class Sign {
	private final Signature sign = Signature.getInstance("SHA256withRSA");
}
