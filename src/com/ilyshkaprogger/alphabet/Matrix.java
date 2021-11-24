package com.ilyshkaprogger.alphabet;

class Matrix {

    protected static char[][] theSpaceMatrix(int length) {
        char[][] matrix = new char[length][length];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = ' ';
            }
        }
        return matrix;
    }

    protected static char[][] theDRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - matrix.length / 10 - 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][matrix.length / 10 + j] = 'д';
                matrix[i][matrix.length - 1 - matrix.length / 10 - j] = 'д';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = matrix.length / 10 + 1; j < matrix.length - 1 - matrix.length / 10; j++) {
                matrix[i][j] = 'д';
                matrix[matrix.length - matrix.length / 10 - i][j] = 'д';
            }
        }
        for (int i = 1; i < matrix.length / 5; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[matrix.length - 1 - i][j] = 'д';
                matrix[matrix.length - 1 - i][matrix.length - j - 1] = 'д';
            }
        }
        return matrix;
    }

    protected static char[][] theUYRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - matrix.length / 10 - 1; j++) {
                matrix[i + matrix.length / 2][j / 2 + 1] = 'ю';
                matrix[i][j / 2 + matrix.length / 2 - 1] = 'ю';
                matrix[matrix.length - 1 - i][j / 2 + matrix.length / 2 - 1] = 'ю';
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'ю';
                matrix[i][matrix.length - 1 - j] = 'ю';
                matrix[i][matrix.length / 2 - 1 - matrix.length / 10 + j] = 'ю';
            }
        }
        return matrix;
    }

    protected static char[][] theGMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - matrix.length / 10 - 1; j++) {
                matrix[i][j] = 'g';
                matrix[i + matrix.length / 2 - matrix.length / 10 - 1][j / 2 + matrix.length / 2 - 1] = 'g';
                matrix[matrix.length - i - 1][j] = 'g';
            }
        }
        for (int i = 1; i < matrix.length / 2 + 1 - matrix.length / 10; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[matrix.length - 1 - i - matrix.length / 10][matrix.length - j - 1] = 'g';
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'g';
            }
        }
        return matrix;
    }

    protected static char[][] theDMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - matrix.length / 10 - 1; j++) {
                matrix[i][j] = 'd';
                matrix[matrix.length - i - 1][j] = 'd';
            }
        }
        for (int i = matrix.length / 10 + 1; i < matrix.length - 1 - matrix.length / 10; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'd';
                matrix[i][matrix.length - j - 1] = 'd';
            }
        }
        return matrix;
    }

    protected static char[][] theZRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = matrix.length / 10 + 1; j < matrix.length - matrix.length / 10 - 1; j++) {
                matrix[i][j] = 'з';
                matrix[i + matrix.length / 2 - 2][j / 2 + matrix.length / 2 - 1] = 'з';
                matrix[i + matrix.length / 2 - matrix.length / 10][j / 2 + matrix.length / 2 - 1] = 'з';
                matrix[matrix.length - i - 1][j] = 'з';
            }
        }
        for (int i = matrix.length / 10 + 1; i < matrix.length / 2 + 1 - matrix.length / 10; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[matrix.length - 1 - i][matrix.length - j - 1] = 'з';
                matrix[i][matrix.length - j - 1] = 'з';
            }
        }
        return matrix;
    }

    protected static char[][] theAARussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'а';
                matrix[i + matrix.length / 2 - 2][j / 2 + matrix.length / 2 - 1] = 'а';
                matrix[matrix.length - i - 1][j] = 'а';
            }
        }
        for (int i = 1; i < matrix.length / 2 + 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[matrix.length - 1 - i][matrix.length - j - 1] = 'а';
                matrix[i][matrix.length - j - 1] = 'а';
            }
        }
        return matrix;
    }

    protected static char[][] theChRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i + matrix.length / 2 - 2][j] = 'ч';
            }
        }
        for (int i = 1; i < matrix.length / 2 + 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'ч';
                matrix[matrix.length - 1 - i][matrix.length - j - 1] = 'ч';
                matrix[i][matrix.length - j - 1] = 'ч';
            }
        }
        return matrix;
    }

    protected static char[][] theSMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 's';
                matrix[i + matrix.length / 2 - 2][j] = 's';
                matrix[matrix.length - i - 1][j] = 's';
            }
        }
        for (int i = 1; i < matrix.length / 2 + 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 's';
                matrix[matrix.length - 1 - i][matrix.length - j - 1] = 's';
            }
        }
        return matrix;
    }

    protected static char[][] theFRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'ф';
                matrix[i + matrix.length / 2][j] = 'ф';
            }
        }
        for (int i = 1; i < matrix.length / 2 + 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'ф';
                matrix[i][matrix.length - j - 1] = 'ф';
                matrix[i][matrix.length / 2 - j + 1] = 'ф';
                matrix[matrix.length / 2 + i - 2][matrix.length / 2 - j + 1] = 'ф';
            }
        }
        return matrix;
    }

    protected static char[][] theJRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = matrix.length / 2 + i / 2; j < matrix.length / 2 + matrix.length / 10 + i / 2; j++) {
                matrix[matrix.length / 2 + i - 1][j] = 'ж';
                matrix[matrix.length / 2 + i - 1][matrix.length - j - 1] = 'ж';
                matrix[matrix.length / 2 - i][j] = 'ж';
                matrix[matrix.length / 2 - i][matrix.length - j - 1] = 'ж';
            }
            for (int j = matrix.length / 2 - matrix.length / 10 + 1; j < matrix.length / 2 + matrix.length / 10 - 1; j++) {
                matrix[i + 1][j] = 'ж';
                matrix[matrix.length / 2 + i - 1][j] = 'ж';
            }
        }
        return matrix;
    }

    protected static char[][] theZMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - matrix.length / 10; i++) {
            for (int j = i; j < matrix.length / 10 + i; j++) {
                matrix[i][matrix.length - 1 - j] = 'z';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'z';
                matrix[matrix.length - matrix.length / 10 - i][j] = 'z';
            }
        }
        return matrix;
    }

    protected static char[][] theIRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - matrix.length / 10; i++) {
            for (int j = i; j < matrix.length / 10 + i; j++) {
                matrix[i][matrix.length - 1 - j] = 'и';
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'и';
                matrix[i][matrix.length - 2 - matrix.length / 10 + j] = 'и';
            }
        }
        return matrix;
    }

    protected static char[][] theNMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - matrix.length / 10; i++) {
            for (int j = i; j < matrix.length / 10 + i; j++) {
                matrix[i][j] = 'n';
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'n';
                matrix[i][matrix.length - 2 - matrix.length / 10 + j] = 'n';
            }
        }
        return matrix;
    }

    protected static char[][] theTHRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'ш';
                matrix[i][matrix.length - 1 - j] = 'ш';
                matrix[i][matrix.length / 2 - matrix.length / 10 + j] = 'ш';
            }
        }
        for (int i = matrix.length - 1 - matrix.length / 10; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'ш';
            }
        }
        return matrix;
    }

    protected static char[][] theTShRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = matrix.length / 10 + 1; i < matrix.length - matrix.length / 10 - 1; i++) {
            for (int j = matrix.length / 10 + 1; j < 2 * (matrix.length / 10) + 1; j++) {
                matrix[i - matrix.length / 10][j - matrix.length / 10] = 'щ';
                matrix[i - matrix.length / 10][matrix.length - 1 - j] = 'щ';
                matrix[i - matrix.length / 10][matrix.length / 2 + matrix.length / 10 - j] = 'щ';
            }
        }
        for (int i = 1 + matrix.length / 10; i < 2 * (matrix.length / 10) + 1; i++) {
            for (int j = 1 + matrix.length / 10; j < matrix.length - 1 - matrix.length / 10; j++) {
                matrix[matrix.length - 1 - i][j] = 'щ';
            }
        }
        for (int i = matrix.length - 2 * (matrix.length / 10) - 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length - matrix.length / 10 - 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'щ';
            }
        }
        return matrix;
    }

    protected static char[][] theCRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = matrix.length / 10 + 1; i < matrix.length - matrix.length / 10 - 1; i++) {
            for (int j = matrix.length / 10 + 1; j < 2 * (matrix.length / 10) + 1; j++) {
                matrix[i - matrix.length / 10][j - matrix.length / 10] = 'ц';
                matrix[i - matrix.length / 10][matrix.length - 1 - j] = 'ц';
            }
        }
        for (int i = 1 + matrix.length / 10; i < 2 * (matrix.length / 10) + 1; i++) {
            for (int j = 1 + matrix.length / 10; j < matrix.length - 1 - matrix.length / 10; j++) {
                matrix[matrix.length - 1 - i][j] = 'ц';
            }
        }
        for (int i = matrix.length - 2 * (matrix.length / 10) - 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length - matrix.length / 10 - 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'ц';
            }
        }
        return matrix;
    }

    protected static char[][] theQMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = matrix.length / 10 + 1; i < matrix.length - matrix.length / 10 - 1; i++) {
            for (int j = matrix.length / 10 + 1; j < 2 * (matrix.length / 10) + 1; j++) {
                matrix[i - matrix.length / 10][j - matrix.length / 10] = 'q';
                matrix[i - matrix.length / 10][matrix.length - 1 - j] = 'q';
            }
        }
        for (int i = 1 + matrix.length / 10; i < 2 * (matrix.length / 10) + 1; i++) {
            for (int j = 1 + matrix.length / 10; j < matrix.length - 1 - matrix.length / 10; j++) {
                matrix[i - matrix.length / 10][j - matrix.length / 10] = 'q';
                matrix[matrix.length - 1 - i][j] = 'q';
            }
        }
        for (int i = matrix.length - 2 * (matrix.length / 10) - 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length - matrix.length / 10 - 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'q';
            }
        }
        return matrix;
    }

    protected static char[][] theOMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'o';
                matrix[i][matrix.length - 1 - j] = 'o';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'o';
                matrix[matrix.length - 1 - i][j] = 'o';
            }
        }
        return matrix;
    }

    protected static char[][] theUURussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 2; i++) {
            for (int j = 1; j < (matrix.length / 10) + 1; j++) {
                matrix[i][j] = 'ы';
                matrix[matrix.length - 1 - i][j] = 'ы';
                matrix[matrix.length - 1 - i][matrix.length - 1 - 2 * (matrix.length / 10) - j] = 'ы';
                matrix[i][matrix.length - matrix.length / 10 - 2 + j] = 'ы';
                matrix[matrix.length - 1 - i][matrix.length - matrix.length / 10 - 2 + j] = 'ы';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = matrix.length / 10 + 1; j < matrix.length - 1 - 2 * (matrix.length / 10); j++) {
                matrix[i + matrix.length / 2 - matrix.length / 10][j] = 'ы';
                matrix[i + matrix.length / 2 - 1][j] = 'ы';
                matrix[i + matrix.length - matrix.length / 10 - 2][j] = 'ы';
            }
        }
        return matrix;
    }

    protected static char[][] theHardSymbolRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'ъ';
            }
        }
        for (int i = 1; i < matrix.length / 2; i++) {
            for (int j = matrix.length / 10 + 1; j < 2 * (matrix.length / 10) + 1; j++) {
                matrix[i][j] = 'ъ';
                matrix[matrix.length - 1 - i][j] = 'ъ';
                matrix[matrix.length - 1 - i][matrix.length - 1 - j + matrix.length / 10] = 'ъ';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = matrix.length / 10 + 1; j < matrix.length - 1; j++) {
                matrix[i + matrix.length / 2 - matrix.length / 10][j] = 'ъ';
                matrix[i + matrix.length / 2 - 1][j] = 'ъ';
                matrix[i + matrix.length - matrix.length / 10 - 2][j] = 'ъ';
            }
        }
        return matrix;
    }

    protected static char[][] theSoftSymbolRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 2; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'ь';
                matrix[matrix.length - 1 - i][j] = 'ь';
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = 'ь';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i + matrix.length / 2 - matrix.length / 10][j] = 'ь';
                matrix[i + matrix.length / 2 - 1][j] = 'ь';
                matrix[i + matrix.length - matrix.length / 10 - 2][j] = 'ь';
            }
        }
        return matrix;
    }

    protected static char[][] theBRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 2; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'б';
                matrix[matrix.length - 1 - i][j] = 'б';
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = 'б';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'б';
                matrix[i + matrix.length / 2 - matrix.length / 10][j] = 'б';
                matrix[i + matrix.length / 2 - 1][j] = 'б';
                matrix[i + matrix.length - matrix.length / 10 - 2][j] = 'б';
            }
        }
        return matrix;
    }

    protected static char[][] theBMatrix(char symbol, int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length / 2; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = symbol;
                matrix[matrix.length - 1 - i][j] = symbol;
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = symbol;
                matrix[i][matrix.length - matrix.length / 10 - 1 - j] = symbol;
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - matrix.length / 10 - 1; j++) {
                matrix[i][j] = symbol;
                matrix[i + matrix.length / 2 - matrix.length / 10][j] = symbol;
                matrix[i + matrix.length / 2 - 1][j] = symbol;
                matrix[i + matrix.length - matrix.length / 10 - 2][j] = symbol;
            }
        }
        return matrix;
    }

    protected static char[][] theMMatrix(char symbol, int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = i / 4; j < matrix.length / 10 + (i / 4); j++) {
                matrix[matrix.length - i - 2][matrix.length - 1 - 1 - j] = symbol;
                matrix[matrix.length - i - 2][j + 1] = symbol;
                if (matrix.length % 2 != 0) {
                    matrix[matrix.length - i - 2][matrix.length / 2 - j + 1] = symbol;
                } else {
                    matrix[matrix.length - i - 2][matrix.length / 2 - j] = symbol;
                }
                matrix[matrix.length - i - 2][matrix.length / 2 + j - 1] = symbol;
            }
        }
        return matrix;
    }

    protected static char[][] theKMatrix(char symbol, int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = symbol;
            }
        }
        int count = 0;
        int countLess = 0;
        for (int i = matrix.length / 2; i > 0; i--) {
            for (int j = matrix.length / 10 + 1 + count; j < (2 * matrix.length / 10) + count + 1; j++) {
                matrix[i][j] = symbol;
                matrix[matrix.length - i - 1][j] = symbol;
            }
            countLess++;
            if (countLess == matrix.length / 10) {
                count += matrix.length / 10;
                countLess = 0;
            }
        }
        return matrix;
    }

    protected static char[][] theIMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length / 2; j < matrix.length / 2 + matrix.length / 10; j++) {
                matrix[i][j] = 't';
                matrix[i][matrix.length - j - 1] = 't';
            }
        }
        return matrix;
    }

    protected static char[][] theTMatrix(char symbol, int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = matrix.length / 10; i > 0; i--) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = symbol;
            }
        }
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length / 2; j < matrix.length / 2 + matrix.length / 10; j++) {
                matrix[i][j] = symbol;
                matrix[i][matrix.length - j] = symbol;
            }
        }
        return matrix;
    }

    protected static char[][] theYMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        int count = 0;
        int countLess = 0;
        for (int i = matrix.length / 2; i > 0; i--) {
            for (int j = matrix.length / 2 + 2 * count; j < matrix.length / 2 + matrix.length / 10 + 2 * count; j++) {
                matrix[i][j - 1] = 'y';
                matrix[i][matrix.length - j] = 'y';
            }
            countLess++;
            if (countLess == matrix.length / 10) {
                count++;
                countLess = 0;
            }
        }
        for (int i = matrix.length / 2 - 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length / 2; j < matrix.length / 2 + matrix.length / 10; j++) {
                matrix[i][matrix.length - j] = 'y';
            }
        }
        return matrix;
    }

    protected static char[][] theYRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        int count = 0;
        int countLess = 0;
        for (int i = matrix.length / 2; i > 0; i--) {
            for (int j = matrix.length / 2 + 2 * count; j < matrix.length / 2 + matrix.length / 10 + 2 * count; j++) {
                matrix[i][j - 1] = 'у';
                matrix[i][matrix.length - j] = 'у';
            }
            countLess++;
            if (countLess == matrix.length / 10) {
                count++;
                countLess = 0;
            }
        }
        count = 0;
        countLess = 0;
        for (int i = matrix.length / 2 - 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length / 2 + 2 * count; j < matrix.length / 2 + matrix.length / 10 + 2 * count; j++) {
                matrix[i][matrix.length - j] = 'у';
            }
            countLess++;
            if (countLess == matrix.length / 10) {
                count++;
                countLess = 0;
            }
        }
        return matrix;
    }

    protected static char[][] theXMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = matrix.length / 2 + i / 2; j < matrix.length / 2 + matrix.length / 10 + i / 2; j++) {
                matrix[matrix.length / 2 + i - 1][j] = 'x';
                matrix[matrix.length / 2 + i - 1][matrix.length - j - 1] = 'x';
                matrix[matrix.length / 2 - i][j] = 'x';
                matrix[matrix.length / 2 - i][matrix.length - j - 1] = 'x';
            }
        }
        return matrix;
    }

    protected static char[][] theWMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = i / 4; j < matrix.length / 10 + (i / 4); j++) {
                matrix[i + 1][matrix.length - 1 - 1 - j] = 'w';
                matrix[i + 1][j + 1] = 'w';
                if (matrix.length % 2 != 0) {
                    matrix[i + 1][matrix.length / 2 - j + 1] = 'w';
                } else {
                    matrix[i + 1][matrix.length / 2 - j] = 'w';
                }
                matrix[i + 1][matrix.length / 2 + j - 1] = 'w';
            }
        }
        return matrix;
    }

    protected static char[][] theVMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = i / 2; j < matrix.length / 10 + (i / 2); j++) {
                matrix[i + 1][matrix.length - 1 - 1 - j] = 'v';
                matrix[i + 1][j + 1] = 'v';
            }
        }
        return matrix;
    }

    protected static char[][] theJARussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length - (matrix.length / 10 + 1); j < matrix.length - 1; j++) {
                matrix[i][j] = 'я';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'я';
            }
        }
        for (int i = matrix.length / 2 - (matrix.length / 10 + 1); i < matrix.length / 2 - 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'я';
            }
        }
        for (int i = 1; i < matrix.length / 2 - 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'я';
            }

        }
        int count = 0;
        for (int i = matrix.length / 2 - 1; i < matrix.length - 1; i++) {
            for (int j = 1 + 2 * (matrix.length / 5) + count; j > (matrix.length / 5) + count; j--) {
                matrix[i][matrix.length - j] = 'я';
            }
            count++;
        }
        return matrix;
    }

    protected static char[][] theRMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < (matrix.length / 10) + 1; j++) {
                matrix[i][j] = 'r';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'r';
            }
        }
        for (int i = matrix.length / 2 - (matrix.length / 10 + 1); i < matrix.length / 2 - 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'r';
            }
        }
        for (int i = 1; i < matrix.length / 2 - 1; i++) {
            for (int j = matrix.length - (matrix.length / 10 + 1); j < matrix.length - 1; j++) {
                matrix[i][j] = 'r';
            }
        }
        int count = 0;
        for (int i = matrix.length / 2 - 1; i < matrix.length - 1; i++) {
            for (int j = 1 + matrix.length / 5 + count; j < 2 * (matrix.length / 5) + count; j++) {
                matrix[i][j] = 'r';
            }
            count++;
        }
        return matrix;
    }

    protected static char[][] thePMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < (matrix.length / 10) + 1; j++) {
                matrix[i][j] = 'p';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'p';
            }
        }
        for (int i = matrix.length / 2 - (matrix.length / 10 + 1); i < matrix.length / 2 - 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'p';
            }
        }
        for (int i = 1; i < matrix.length / 2 - 1; i++) {
            for (int j = matrix.length - (matrix.length / 10 + 1); j < matrix.length - 1; j++) {
                matrix[i][j] = 'p';
            }
        }
        return matrix;
    }

    protected static char[][] theEMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < (matrix.length / 10) + 1; j++) {
                matrix[i][j] = 'e';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'e';
            }
        }
        for (int i = matrix.length / 2 - (matrix.length / 10 + 1); i < matrix.length / 2 - 1; i++) {
            for (int j = 1; j < matrix.length / 2 + 1; j++) {
                matrix[i][j] = 'e';
            }
        }
        for (int i = matrix.length - (matrix.length / 10 + 1); i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'e';
            }
        }
        return matrix;
    }

    protected static char[][] theFMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < (matrix.length / 10) + 1; j++) {
                matrix[i][j] = 'f';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'f';
            }
        }
        for (int i = matrix.length / 2 - (matrix.length / 10 + 1); i < matrix.length / 2 - 1; i++) {
            for (int j = 1; j < matrix.length / 2 + 1; j++) {
                matrix[i][j] = 'f';
            }
        }
        return matrix;
    }

    protected static char[][] theCMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < (matrix.length / 10) + 1; j++) {
                matrix[i][j] = 'c';
            }
        }
        for (int i = 1; i < matrix.length / 10 + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'c';
            }
        }
        for (int i = matrix.length - (matrix.length / 10 + 1); i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'c';
            }
        }
        return matrix;
    }

    protected static char[][] theUMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < (matrix.length / 10) + 1; j++) {
                matrix[i][j] = 'u';
            }
            for (int j = (matrix.length - (matrix.length / 10 + 1)); j < matrix.length - 1; j++) {
                matrix[i][j] = 'u';
            }
        }
        for (int i = matrix.length - (matrix.length / 10 + 1); i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'u';
            }
        }
        return matrix;
    }

    protected static char[][] theJMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = (matrix.length - (matrix.length / 10 + 1)); j < matrix.length - 1; j++) {
                matrix[i][j] = 'j';
            }
        }
        for (int i = matrix.length - (matrix.length / 10 + 1); i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'j';
            }
        }
        for (int i = matrix.length - (2 * (matrix.length / 10 + 1)); i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length / 10 + 1; j++) {
                matrix[i][j] = 'j';
            }
        }
        return matrix;
    }

    protected static char[][] theHMatrix(char symbol, int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < (matrix.length / 10) + 1; j++) {
                matrix[i][j] = symbol;
            }
            for (int j = (matrix.length - (matrix.length / 10 + 1)); j < matrix.length - 1; j++) {
                matrix[i][j] = symbol;
            }
        }
        for (int i = matrix.length / 2; i < matrix.length / 2 + (matrix.length / 10) + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = symbol;
            }
        }
        return matrix;
    }

    protected static char[][] thePRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < (matrix.length / 10) + 1; j++) {
                matrix[i][j] = 'п';
            }
            for (int j = (matrix.length - (matrix.length / 10 + 1)); j < matrix.length - 1; j++) {
                matrix[i][j] = 'п';
            }
        }
        for (int i = 1; i < (matrix.length / 10) + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'п';
            }
        }
        return matrix;
    }

    protected static char[][] theGRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < (matrix.length / 10) + 1; j++) {
                matrix[i][j] = 'г';
            }
        }
        for (int i = 1; i < (matrix.length / 10) + 1; i++) {
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] = 'г';
            }
        }
        return matrix;
    }

    protected static char[][] theAMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        int count = 1;
        int countChange = 0;
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length / 2 - count; j > matrix.length / 2 - count - (matrix.length / 10 + 1); j--) {
                matrix[i][j] = 'a';
            }
            countChange++;
            if (countChange == matrix.length / 10 + 1) {
                count++;
                countChange = 0;
            }
        }
        count = 1;
        countChange = 0;
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length / 2 + count - 1; j < matrix.length / 2 + count + (matrix.length / 10 + 1) - 1; j++) {
                matrix[i][j] = 'a';
            }
            countChange++;
            if (countChange == matrix.length / 10 + 1) {
                count++;
                countChange = 0;
            }
        }
        for (int i = matrix.length / 2; i < matrix.length / 2 + (matrix.length / 10 + 1); i++) {
            for (int j = matrix.length / 3; j < matrix.length - 1 - (matrix.length / 3); j++) {
                matrix[i][j] = 'a';
            }
        }
        return matrix;
    }

    protected static char[][] theLMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix.length / 5; j++) {
                matrix[i][j] = 'l';
            }
        }
        for (int i = matrix.length / 3 + matrix.length / 2 + 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length - 2; j > matrix.length / 5 - 1; j--) {
                matrix[i][j] = 'l';
            }
        }
        return matrix;
    }

    protected static char[][] theLRussianMatrix(int length) {
        char[][] matrix = theSpaceMatrix(length);
        int count = 1;
        int countChange = 0;
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length / 2 - count; j > matrix.length / 2 - count - (matrix.length / 10 + 1); j--) {
                matrix[i][j] = 'л';
            }
            countChange++;
            if (countChange == matrix.length / 10 + 2
            ) {
                count++;
                countChange = 0;
            }
        }
        count = 1;
        countChange = 0;
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = matrix.length / 2 + count - 1; j < matrix.length / 2 + count + (matrix.length / 10 + 1) - 1; j++) {
                matrix[i][j] = 'л';
            }
            countChange++;
            if (countChange == matrix.length / 10 + 1) {
                count++;
                countChange = 0;
            }
        }
        return matrix;
    }
}
