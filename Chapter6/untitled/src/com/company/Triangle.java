package com.company;

public class Triangle
{


    public int sideA;
    public int sideB;
    public int sideC;

    public void setSideA(int sideA)
    {
        this.sideA = sideA;
    }

    public void setSideB(int sideB)
    {
        this.sideB = sideB;
    }

    public void setSideC(int sideC)
    {
        this.sideC = sideC;
    }

    public int getSideA()
    {
        return this.sideA;
    }

    public int getSideB()
    {
        return this.sideB;
    }

    public int getSideC()
    {
        return this.sideC;
    }

    public int getPerimeter()
    {
        return sideA + sideB + sideC;
    }

    public boolean isEquilateral()
    {
        System.out.println("The triangle is an equilateral: ");
        if (this.sideA == this.sideB && this.sideB == this.sideC)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public boolean isIsosceles()
    {

        if (sideA == sideB && (sideB != sideC || sideA != sideC))
        {
            return true;
        }
        else if (sideB == sideC && (sideB != sideA || sideC != sideA))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public boolean isScalene()
    {
        if (sideA != sideB && sideB != sideC)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public boolean isValid()
    {
        if ((sideA + sideB > sideC) || (sideC + sideB > sideA) || (sideA + sideC > sideB))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public boolean isRightAngle()
    {
        if (((sideA * sideA) + (sideB * sideB)) == (sideC * sideC) || ((sideB * sideB) + (sideC * sideC)) == (sideA * sideA) || ((sideA * sideA) + (sideC * sideC)) == (sideB * sideB))
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public boolean isAcute()
    {
        if (((sideA * sideA) + (sideB * sideB)) > (sideC * sideC) || ((sideB * sideB) + (sideC * sideC)) > (sideA * sideA) || ((sideA * sideA) + (sideC * sideC)) > (sideB * sideB))
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public boolean isObtuse()
    {
        if (((sideA * sideA) + (sideB * sideB)) < (sideC * sideC) || ((sideB * sideB) + (sideC * sideC)) < (sideA * sideA) || ((sideA * sideA) + (sideC * sideC)) < (sideB * sideB))
        {
            return true;
        }

        else
        {
            return false;
        }
    }


}




