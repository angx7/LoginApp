package com.example.loginapp.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.PathFillType

val Github: ImageVector
    get() {
        if (_Github != null) return _Github!!

        _Github = ImageVector.Builder(
            name = "Github",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(8f, 0f)
                curveTo(3.58f, 0f, 0f, 3.58f, 0f, 8f)
                curveToRelative(0f, 3.54f, 2.29f, 6.53f, 5.47f, 7.59f)
                curveToRelative(0.4f, 0.07f, 0.55f, -0.17f, 0.55f, -0.38f)
                curveToRelative(0f, -0.19f, -0.01f, -0.82f, -0.01f, -1.49f)
                curveToRelative(-2.01f, 0.37f, -2.53f, -0.49f, -2.69f, -0.94f)
                curveToRelative(-0.09f, -0.23f, -0.48f, -0.94f, -0.82f, -1.13f)
                curveToRelative(-0.28f, -0.15f, -0.68f, -0.52f, -0.01f, -0.53f)
                curveToRelative(0.63f, -0.01f, 1.08f, 0.58f, 1.23f, 0.82f)
                curveToRelative(0.72f, 1.21f, 1.87f, 0.87f, 2.33f, 0.66f)
                curveToRelative(0.07f, -0.52f, 0.28f, -0.87f, 0.51f, -1.07f)
                curveToRelative(-1.78f, -0.2f, -3.64f, -0.89f, -3.64f, -3.95f)
                curveToRelative(0f, -0.87f, 0.31f, -1.59f, 0.82f, -2.15f)
                curveToRelative(-0.08f, -0.2f, -0.36f, -1.02f, 0.08f, -2.12f)
                curveToRelative(0f, 0f, 0.67f, -0.21f, 2.2f, 0.82f)
                curveToRelative(0.64f, -0.18f, 1.32f, -0.27f, 2f, -0.27f)
                reflectiveCurveToRelative(1.36f, 0.09f, 2f, 0.27f)
                curveToRelative(1.53f, -1.04f, 2.2f, -0.82f, 2.2f, -0.82f)
                curveToRelative(0.44f, 1.1f, 0.16f, 1.92f, 0.08f, 2.12f)
                curveToRelative(0.51f, 0.56f, 0.82f, 1.27f, 0.82f, 2.15f)
                curveToRelative(0f, 3.07f, -1.87f, 3.75f, -3.65f, 3.95f)
                curveToRelative(0.29f, 0.25f, 0.54f, 0.73f, 0.54f, 1.48f)
                curveToRelative(0f, 1.07f, -0.01f, 1.93f, -0.01f, 2.2f)
                curveToRelative(0f, 0.21f, 0.15f, 0.46f, 0.55f, 0.38f)
                arcTo(8.01f, 8.01f, 0f, false, false, 16f, 8f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
            }
        }.build()

        return _Github!!
    }

private var _Github: ImageVector? = null


val EyeOpen: ImageVector
    get() {
        if (_EyeOpen != null) return _EyeOpen!!

        _EyeOpen = ImageVector.Builder(
            name = "EyeOpen",
            defaultWidth = 15.dp,
            defaultHeight = 15.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 11f)
                curveTo(4.80285f, 11f, 2.52952f, 9.62184f, 1.09622f, 7.50001f)
                curveTo(2.52952f, 5.37816f, 4.80285f, 4f, 7.5f, 4f)
                curveTo(10.1971f, 4f, 12.4705f, 5.37816f, 13.9038f, 7.50001f)
                curveTo(12.4705f, 9.62183f, 10.1971f, 11f, 7.5f, 11f)
                close()
                moveTo(7.5f, 3f)
                curveTo(4.30786f, 3f, 1.65639f, 4.70638f, 0.0760002f, 7.23501f)
                curveTo(-0.0253338f, 7.39715f, -0.0253334f, 7.60288f, 0.0760014f, 7.76501f)
                curveTo(1.65639f, 10.2936f, 4.30786f, 12f, 7.5f, 12f)
                curveTo(10.6921f, 12f, 13.3436f, 10.2936f, 14.924f, 7.76501f)
                curveTo(15.0253f, 7.60288f, 15.0253f, 7.39715f, 14.924f, 7.23501f)
                curveTo(13.3436f, 4.70638f, 10.6921f, 3f, 7.5f, 3f)
                close()
                moveTo(7.5f, 9.5f)
                curveTo(8.60457f, 9.5f, 9.5f, 8.60457f, 9.5f, 7.5f)
                curveTo(9.5f, 6.39543f, 8.60457f, 5.5f, 7.5f, 5.5f)
                curveTo(6.39543f, 5.5f, 5.5f, 6.39543f, 5.5f, 7.5f)
                curveTo(5.5f, 8.60457f, 6.39543f, 9.5f, 7.5f, 9.5f)
                close()
            }
        }.build()

        return _EyeOpen!!
    }

private var _EyeOpen: ImageVector? = null


val EyeClosed: ImageVector
    get() {
        if (_EyeClosed != null) return _EyeClosed!!

        _EyeClosed = ImageVector.Builder(
            name = "EyeClosed",
            defaultWidth = 15.dp,
            defaultHeight = 15.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.7649f, 6.07596f)
                curveTo(14.9991f, 6.22231f, 15.0703f, 6.53079f, 14.9239f, 6.76495f)
                curveTo(14.4849f, 7.46743f, 13.9632f, 8.10645f, 13.3702f, 8.66305f)
                lineTo(14.5712f, 9.86406f)
                curveTo(14.7664f, 10.0593f, 14.7664f, 10.3759f, 14.5712f, 10.5712f)
                curveTo(14.3759f, 10.7664f, 14.0593f, 10.7664f, 13.8641f, 10.5712f)
                lineTo(12.6011f, 9.30817f)
                curveTo(11.805f, 9.90283f, 10.9089f, 10.3621f, 9.93375f, 10.651f)
                lineTo(10.383f, 12.3277f)
                curveTo(10.4544f, 12.5944f, 10.2961f, 12.8685f, 10.0294f, 12.94f)
                curveTo(9.76267f, 13.0115f, 9.4885f, 12.8532f, 9.41704f, 12.5865f)
                lineTo(8.95917f, 10.8775f)
                curveTo(8.48743f, 10.958f, 8.00036f, 10.9999f, 7.50001f, 10.9999f)
                curveTo(6.99965f, 10.9999f, 6.51257f, 10.958f, 6.04082f, 10.8775f)
                lineTo(5.58299f, 12.5864f)
                curveTo(5.51153f, 12.8532f, 5.23737f, 13.0115f, 4.97064f, 12.94f)
                curveTo(4.7039f, 12.8686f, 4.5456f, 12.5944f, 4.61706f, 12.3277f)
                lineTo(5.06625f, 10.651f)
                curveTo(4.09111f, 10.3621f, 3.19503f, 9.90282f, 2.3989f, 9.30815f)
                lineTo(1.1359f, 10.5712f)
                curveTo(0.940638f, 10.7664f, 0.624058f, 10.7664f, 0.428798f, 10.5712f)
                curveTo(0.233537f, 10.3759f, 0.233537f, 10.0593f, 0.428798f, 9.86405f)
                lineTo(1.62982f, 8.66303f)
                curveTo(1.03682f, 8.10643f, 0.515113f, 7.46742f, 0.0760677f, 6.76495f)
                curveTo(-0.0702867f, 6.53079f, 0.000898544f, 6.22231f, 0.235065f, 6.07596f)
                curveTo(0.469231f, 5.9296f, 0.777703f, 6.00079f, 0.924058f, 6.23496f)
                curveTo(1.40354f, 7.00213f, 1.989f, 7.68057f, 2.66233f, 8.2427f)
                curveTo(2.67315f, 8.25096f, 2.6837f, 8.25972f, 2.69397f, 8.26898f)
                curveTo(4.00897f, 9.35527f, 5.65537f, 9.99991f, 7.50001f, 9.99991f)
                curveTo(10.3078f, 9.99991f, 12.6564f, 8.5063f, 14.076f, 6.23495f)
                curveTo(14.2223f, 6.00079f, 14.5308f, 5.9296f, 14.7649f, 6.07596f)
                close()
            }
        }.build()

        return _EyeClosed!!
    }

private var _EyeClosed: ImageVector? = null




