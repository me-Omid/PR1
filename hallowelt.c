#include <QApplication>
#include <QLabel>

int main(int argc, char *argv[]) {
    QApplication app(argc, argv);   // Qt-Anwendung starten

    QLabel label("Hallo Welt!");     // Text-Label erstellen
    label.resize(200, 50);          // Größe setzen
    label.show();                    // Fenster anzeigen

    return app.exec();               // Event-Schleife starten
}
