#include <stdio.h>
#include <windows.h>

int main()
{
    SystemParametersInfo(SPI_SETDESKWALLPAPER,0,"stairs.jpg",SPIF_UPDATEINIFILE | SPIF_SENDCHANGE);
    return 0;
}