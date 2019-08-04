#include <stdio.h>
#include <windows.h>

int main()
{
    SystemParametersInfo(SPI_SETDESKWALLPAPER,0,"C:\\Users\\Arun Muthu\\Pictures\\AutomaticBackgroundChanger\\test5.jpg",SPIF_UPDATEINIFILE | SPIF_SENDCHANGE);
    return 0;
}