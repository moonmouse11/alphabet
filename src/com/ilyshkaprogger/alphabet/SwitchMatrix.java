package com.ilyshkaprogger.alphabet;

class SwitchMatrix extends Matrix {
    private static char[][] toMatrix(char symbol) {
        return switch (symbol) {
            case 'a', 'а' -> theAMatrix(InputValue.getLength());
            case 'c', 'с' -> theCMatrix(InputValue.getLength());
            case 'u' -> theUMatrix(InputValue.getLength());
            case 'j' -> theJMatrix(InputValue.getLength());
            case 'h' -> theHMatrix('h', InputValue.getLength());
            case 'н' -> theHMatrix('н', InputValue.getLength());
            case 'п' -> thePRussianMatrix(InputValue.getLength());
            case 'г' -> theGRussianMatrix(InputValue.getLength());
            case 'l' -> theLMatrix(InputValue.getLength());
            case 'л' -> theLRussianMatrix(InputValue.getLength());
            case 'f' -> theFMatrix(InputValue.getLength());
            case 'e', 'е', 'ё' -> theEMatrix(InputValue.getLength());
            case 'p', 'р' -> thePMatrix(InputValue.getLength());
            case 'r' -> theRMatrix(InputValue.getLength());
            case 'я' -> theJARussianMatrix(InputValue.getLength());
            case 'v' -> theVMatrix(InputValue.getLength());
            case 'w' -> theWMatrix(InputValue.getLength());
            case 'x', 'х' -> theXMatrix(InputValue.getLength());
            case 'у' -> theYRussianMatrix(InputValue.getLength());
            case 'y' -> theYMatrix(InputValue.getLength());
            case 't' -> theTMatrix('t', InputValue.getLength());
            case 'т' -> theTMatrix('т', InputValue.getLength());
            case 'i' -> theIMatrix(InputValue.getLength());
            case 'k' -> theKMatrix('k', InputValue.getLength());
            case 'к' -> theKMatrix('к', InputValue.getLength());
            case 'm' -> theMMatrix('m', InputValue.getLength());
            case 'м' -> theMMatrix('м', InputValue.getLength());
            case 'b' -> theBMatrix('b', InputValue.getLength());
            case 'в' -> theBMatrix('в', InputValue.getLength());
            case 'б' -> theBRussianMatrix(InputValue.getLength());
            case 'ь' -> theSoftSymbolRussianMatrix(InputValue.getLength());
            case 'ъ' -> theHardSymbolRussianMatrix(InputValue.getLength());
            case 'ы' -> theUURussianMatrix(InputValue.getLength());
            case 'o', 'о' -> theOMatrix(InputValue.getLength());
            case 'q' -> theQMatrix(InputValue.getLength());
            case 'ц' -> theCRussianMatrix(InputValue.getLength());
            case 'щ' -> theTShRussianMatrix(InputValue.getLength());
            case 'ш' -> theTHRussianMatrix(InputValue.getLength());
            case 'n' -> theNMatrix(InputValue.getLength());
            case 'й', 'и' -> theIRussianMatrix(InputValue.getLength());
            case 'z' -> theZMatrix(InputValue.getLength());
            case 'ж' -> theJRussianMatrix(InputValue.getLength());
            case 'ф' -> theFRussianMatrix(InputValue.getLength());
            case 's' -> theSMatrix(InputValue.getLength());
            case 'ч' -> theChRussianMatrix(InputValue.getLength());
            case 'э' -> theAARussianMatrix(InputValue.getLength());
            case 'з' -> theZRussianMatrix(InputValue.getLength());
            case 'd' -> theDMatrix(InputValue.getLength());
            case 'g' -> theGMatrix(InputValue.getLength());
            case 'ю' -> theUYRussianMatrix(InputValue.getLength());
            case 'д' -> theDRussianMatrix(InputValue.getLength());
            default -> theSpaceMatrix(InputValue.getLength());
        };
    }

    public static void toPrint() throws InterruptedException {
        char[][] forPrint = allTogether(InputValue.getToPicture().toCharArray());
        for (char[] chars : forPrint) {
            for (char symbol : chars) {
                System.out.print(symbol + " ");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Patient please.");
            }
            System.out.println();
        }
    }

    private static char[][] allTogether(char[] chars) {
        char[][] toMatrix;
        char[][] toPrint = new char[InputValue.getLength()][InputValue.getLength() * chars.length];
        for (int i = 0; i < chars.length; i++) {
            toMatrix = toMatrix(chars[i]);
            for (int j = 0; j < toMatrix.length; j++) {
                System.arraycopy(toMatrix[j], 0, toPrint[j], (InputValue.getLength() * i), toMatrix.length);
            }
        }
        return toPrint;
    }
}
