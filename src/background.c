#include <stdio.h>
#include <string.h>
#include <windows.h>
#include <unistd.h>

int main()
{
    char buff[100];
    getcwd(buff, 250);
    strcat(buff, "\\..\\set up\\photo\\background-photo.jpg");
    SystemParametersInfo(SPI_SETDESKWALLPAPER,0, buff,SPIF_UPDATEINIFILE | SPIF_SENDCHANGE);
    return 0;
}