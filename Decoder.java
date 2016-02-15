package Module9;


import Module9.Encoder;

public class Decoder {

    public static String decodeMechanism(String fileName, int offset) {
        return Encoder.encodeMechanism(fileName, 26-offset);
    }
}
