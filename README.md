# Дренажная емкость

Это упрощенная версия дренажной емкости, позволяющая закачивать жидкость в резервуар и откачивать с помощью насоса.
При достижении минимального или максимального уровня жидкости вылетает сообщение об аварии и задвижка закрывается, а насос выключается.

## Описание
Характеристика резервуара:
Объем 50 м3
Высота резервуара 2.76 м
Закачивается в бак 1м3/с
Откачивается 0.9 м3/с
Минимальный уровень жидкости, при достижении которого возникнет авария 0.558 м
Максимальный уровень жидкости, при достижении которого возникнет авария 2.593 м

Датчики:
LT-3% - показывает на сколько процентов заполнен резурвуар.
LT-4,м - показывает уровень жидкости в резервуаре
TT-5,C - показывает темперутуру жидкости в резервуаре (в моделировании процесса не участвует)

Функционал:
Нажатие на кнопку "Открыть задвижку" открывает ЗВД-1, повторное нажатие закрывает.
Нажатие на кнопку "Включить насос" включает НСС-1, повторное нажатие выключает.
