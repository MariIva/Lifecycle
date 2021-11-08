package ru.arizara.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Всегда вызывайте суперкласс для необходимой инициализации / реализации.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            // Активность создается заново
            // Использует Bundle savedInstanceState для инициализации элементов
            // при пересоздании
            Log.d(TAG, "onCreate(): активность пересоздана");

        } else {
            // Создается новая активность.
            // В Bundle savedInstanceState нет информации о ранее сохраненнной активности
            Log.d(TAG, "onCreate(): создана новая активность");
        }

    }
    @Override
    protected void onStart() {
        // Всегда вызывайте суперкласс для необходимой инициализации / реализации.
        super.onStart();
        Log.d(TAG, "onStart() - активность скоро станет видимой");
    }

    /**
     * onResume() вызывается сразу после onStart(). onResume() вызывается,
     * когда пользователь возобновляет действие из приостановленного состояния (onPause ()).
     * Пользователь может начать взаимодействие с действием. Место для запуска анимации,
     * приобретения эксклюзивных ресурсов, например камеры.
     */
    @Override
    protected void onResume() {
        // Всегда вызывайте суперкласс для необходимой инициализации / реализации.
        super.onResume();
        Log.d(TAG,
                "onResume() - активность стала видимой " +
                        "(теперь она \"возобновлена\"(\"resumed\"))");
    }

    /**
     * Метод вызывается, когда Activity теряет фокус, но все еще отображается
     * в фоновом режиме. Может сопровождаться onStop() или onResume().
     * Для беспрепятственного перехода к следующему действию делегируйте
     * более интенсивные (тяжелые) операции с ЦП на onStop(). Сохраните постоянное состояние
     * (onSaveInstanceState ()) на случай, если приложение будет убито.
     * Часто используется для выпуска эксклюзивных ресурсов.
     */
    @Override
    protected void onPause() {
        // Всегда вызывайте суперкласс для необходимой инициализации / реализации.
        super.onPause();
        Log.d(TAG,
                "onPause() - другое активность переходит в фокус " +
                        "(эта активность скоро будет \"приостановлена\"(\"paused\"))");
    }

    /**
     * Вызывается, когда Activity больше не отображается. Освободите ресурсы,
     * которые могут вызвать утечку памяти. Сохраните состояние экземпляра
     * (onSaveInstanceState ()) на случай, если активность будет прервана.
     */
    @Override
    protected void onStop() {
        // Всегда вызывайте суперкласс для необходимой инициализации / реализации.
        super.onStop();
        Log.d(TAG,
                "onStop() - активность больше не видна " +
                        "(теперь она \"остановлена\"(\"stopped\"))");
    }

    /**
     * Метод вызывается, когда пользователь перезапускает остановленное действие.
     * За ним следует вызов onStart() и onResume().
     */
    @Override
    protected void onRestart() {
        // Всегда вызывайте суперкласс для необходимой инициализации / реализации.
        super.onRestart();
        Log.d(TAG, "onRestart() - активность будет перезапущена restarted()");
    }

    /**
     * Метод, который дает последний шанс освободить ресурсы и
     * остановить порожденные потоки.
     * onDestroy() не всегда может быть вызван - когда система убивает процесс.
     */
    @Override
    protected void onDestroy() {
        // Всегда вызывайте суперкласс для необходимой инициализации / реализации.
        super.onDestroy();
        Log.d(TAG, "onDestroy() - активность вот-вот будет уничтожена ");
    }



}