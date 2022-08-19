public class AudioPlayer implements MediaPlayer{
    private MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void reproduzir(String nomeArquivo, TipoMedia tipoMedia) {
        if (tipoMedia == TipoMedia.MP3) {
            System.out.printf("Reproduzindo MP3: %s", nomeArquivo);
        }

        mediaPlayerAdapter = new MediaPlayerAdapter(tipoMedia);
        mediaPlayerAdapter.reproduzir(nomeArquivo, tipoMedia);
    }

}
