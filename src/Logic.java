import java.util.HashMap;


public class Logic {
    public final HashMap<Character, String> toMorse = new HashMap<>();
    private final HashMap<String, Character> toEng = new HashMap<>();

    public Logic() {
            toMorse.put('A', ".-");
            toMorse.put('B', "-...");
            toMorse.put('C', "-.-.");
            toMorse.put('D', "-..");
            toMorse.put('E', ".");
            toMorse.put('F', "..-.");
            toMorse.put('G', "--.");
            toMorse.put('H', "....");
            toMorse.put('I', "..");
            toMorse.put('J', ".---");
            toMorse.put('K', "-.-");
            toMorse.put('L', ".-..");
            toMorse.put('M', "--");
            toMorse.put('N', "-.");
            toMorse.put('O', "---");
            toMorse.put('P', ".--.");
            toMorse.put('Q', "--.-");
            toMorse.put('R', ".-.");
            toMorse.put('S', "...");
            toMorse.put('T', "-");
            toMorse.put('U', "..-");
            toMorse.put('V', "...-");
            toMorse.put('W', ".--");
            toMorse.put('X', "-..-");
            toMorse.put('Y', "-.--");
            toMorse.put('Z', "--..");

            toEng.put(".-", 'A');
            toEng.put("-...", 'B');
            toEng.put("-.-.", 'C');
            toEng.put("-..", 'D');
            toEng.put(".",'E');
            toEng.put("..-.",'F');
            toEng.put("--.",'G');
            toEng.put("....",'H');
            toEng.put("..",'I');
            toEng.put(".---",'J');
            toEng.put("-.-",'K');
            toEng.put(".-..",'L');
            toEng.put("--",'M');
            toEng.put("-.",'N');
            toEng.put("---",'O');
            toEng.put(".--.",'P');
            toEng.put("--.-",'Q');
            toEng.put(".-.",'R');
            toEng.put("...",'S');
            toEng.put("-",'T');
            toEng.put("..-",'U');
            toEng.put("...-",'V');
            toEng.put(".--",'W');
            toEng.put("-..-",'X');
            toEng.put("-.--", 'Y');
            toEng.put("--..", 'Z');

        }
        public String engToMorse(String english) {
                try {
                        english = english.toUpperCase();

                        if (english.isEmpty()) {
                                throw new IllegalArgumentException("Input cannot be empty");
                        }
                        StringBuilder morse = new StringBuilder();

                        for (int i = 0; i < english.length(); i++) {
                                char c = english.charAt(i);

                                if (c == ' ') {
                                        continue;
                                }

                                String code = toMorse.get(c);

                                if (code == null) {
                                        throw new IllegalArgumentException("Invalid character, only type letters!");
                                }

                                morse.append(code).append(" ");
                        }

                        return morse.toString();
                }
                catch (Exception e) {
                        return "Error: " + e.getMessage();
                }
        }
        public String morseToEng(String morse) {
                try {


                        if (morse.isEmpty()) {
                                throw new IllegalArgumentException("Input cannot be empty");
                        }

                        String[] codes = morse.split(" ");
                        StringBuilder eng = new StringBuilder();

                        for (int i = 0; i < codes.length; i++) {
                                String code = codes[i];
                                if (code.isEmpty()) {
                                        continue;
                                }
                                Character letter = toEng.get(code);
                                if (letter == null) {
                                        throw new IllegalArgumentException("Invalid Morse code: " + code);
                                }
                                eng.append(letter);
                        }

                        return eng.toString();
                }
                catch (Exception e) {
                        return "Error: " + e.getMessage();
                }
        }

}

