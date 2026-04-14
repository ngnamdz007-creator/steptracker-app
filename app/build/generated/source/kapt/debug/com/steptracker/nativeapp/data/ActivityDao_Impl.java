package com.steptracker.nativeapp.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ActivityDao_Impl implements ActivityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ActivityRecord> __insertionAdapterOfActivityRecord;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<ActivityRecord> __deletionAdapterOfActivityRecord;

  private final EntityDeletionOrUpdateAdapter<ActivityRecord> __updateAdapterOfActivityRecord;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ActivityDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfActivityRecord = new EntityInsertionAdapter<ActivityRecord>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `activities` (`id`,`date`,`startTime`,`endTime`,`durationMinutes`,`steps`,`kcal`,`km`,`type`,`startLatitude`,`startLongitude`,`endLatitude`,`endLongitude`,`highestSpeed`,`averageSpeed`,`coordinatesJson`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ActivityRecord entity) {
        statement.bindLong(1, entity.getId());
        final String _tmp = __converters.fromLocalDate(entity.getDate());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        final String _tmp_1 = __converters.fromLocalDateTime(entity.getStartTime());
        if (_tmp_1 == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, _tmp_1);
        }
        final String _tmp_2 = __converters.fromLocalDateTime(entity.getEndTime());
        if (_tmp_2 == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp_2);
        }
        statement.bindLong(5, entity.getDurationMinutes());
        statement.bindLong(6, entity.getSteps());
        statement.bindLong(7, entity.getKcal());
        statement.bindDouble(8, entity.getKm());
        if (entity.getType() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getType());
        }
        if (entity.getStartLatitude() == null) {
          statement.bindNull(10);
        } else {
          statement.bindDouble(10, entity.getStartLatitude());
        }
        if (entity.getStartLongitude() == null) {
          statement.bindNull(11);
        } else {
          statement.bindDouble(11, entity.getStartLongitude());
        }
        if (entity.getEndLatitude() == null) {
          statement.bindNull(12);
        } else {
          statement.bindDouble(12, entity.getEndLatitude());
        }
        if (entity.getEndLongitude() == null) {
          statement.bindNull(13);
        } else {
          statement.bindDouble(13, entity.getEndLongitude());
        }
        statement.bindDouble(14, entity.getHighestSpeed());
        statement.bindDouble(15, entity.getAverageSpeed());
        if (entity.getCoordinatesJson() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getCoordinatesJson());
        }
      }
    };
    this.__deletionAdapterOfActivityRecord = new EntityDeletionOrUpdateAdapter<ActivityRecord>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `activities` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ActivityRecord entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfActivityRecord = new EntityDeletionOrUpdateAdapter<ActivityRecord>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `activities` SET `id` = ?,`date` = ?,`startTime` = ?,`endTime` = ?,`durationMinutes` = ?,`steps` = ?,`kcal` = ?,`km` = ?,`type` = ?,`startLatitude` = ?,`startLongitude` = ?,`endLatitude` = ?,`endLongitude` = ?,`highestSpeed` = ?,`averageSpeed` = ?,`coordinatesJson` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ActivityRecord entity) {
        statement.bindLong(1, entity.getId());
        final String _tmp = __converters.fromLocalDate(entity.getDate());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        final String _tmp_1 = __converters.fromLocalDateTime(entity.getStartTime());
        if (_tmp_1 == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, _tmp_1);
        }
        final String _tmp_2 = __converters.fromLocalDateTime(entity.getEndTime());
        if (_tmp_2 == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp_2);
        }
        statement.bindLong(5, entity.getDurationMinutes());
        statement.bindLong(6, entity.getSteps());
        statement.bindLong(7, entity.getKcal());
        statement.bindDouble(8, entity.getKm());
        if (entity.getType() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getType());
        }
        if (entity.getStartLatitude() == null) {
          statement.bindNull(10);
        } else {
          statement.bindDouble(10, entity.getStartLatitude());
        }
        if (entity.getStartLongitude() == null) {
          statement.bindNull(11);
        } else {
          statement.bindDouble(11, entity.getStartLongitude());
        }
        if (entity.getEndLatitude() == null) {
          statement.bindNull(12);
        } else {
          statement.bindDouble(12, entity.getEndLatitude());
        }
        if (entity.getEndLongitude() == null) {
          statement.bindNull(13);
        } else {
          statement.bindDouble(13, entity.getEndLongitude());
        }
        statement.bindDouble(14, entity.getHighestSpeed());
        statement.bindDouble(15, entity.getAverageSpeed());
        if (entity.getCoordinatesJson() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getCoordinatesJson());
        }
        statement.bindLong(17, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM activities";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final ActivityRecord activity,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfActivityRecord.insertAndReturnId(activity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<ActivityRecord> activities,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfActivityRecord.insert(activities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final ActivityRecord activity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfActivityRecord.handle(activity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final ActivityRecord activity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfActivityRecord.handle(activity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<ActivityRecord>> getAll() {
    final String _sql = "SELECT * FROM activities ORDER BY startTime DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"activities"}, new Callable<List<ActivityRecord>>() {
      @Override
      @NonNull
      public List<ActivityRecord> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfDurationMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "durationMinutes");
          final int _cursorIndexOfSteps = CursorUtil.getColumnIndexOrThrow(_cursor, "steps");
          final int _cursorIndexOfKcal = CursorUtil.getColumnIndexOrThrow(_cursor, "kcal");
          final int _cursorIndexOfKm = CursorUtil.getColumnIndexOrThrow(_cursor, "km");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStartLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLatitude");
          final int _cursorIndexOfStartLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLongitude");
          final int _cursorIndexOfEndLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLatitude");
          final int _cursorIndexOfEndLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLongitude");
          final int _cursorIndexOfHighestSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "highestSpeed");
          final int _cursorIndexOfAverageSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "averageSpeed");
          final int _cursorIndexOfCoordinatesJson = CursorUtil.getColumnIndexOrThrow(_cursor, "coordinatesJson");
          final List<ActivityRecord> _result = new ArrayList<ActivityRecord>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ActivityRecord _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final LocalDate _tmpDate;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp);
            final LocalDateTime _tmpStartTime;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __converters.toLocalDateTime(_tmp_1);
            final LocalDateTime _tmpEndTime;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __converters.toLocalDateTime(_tmp_2);
            final int _tmpDurationMinutes;
            _tmpDurationMinutes = _cursor.getInt(_cursorIndexOfDurationMinutes);
            final int _tmpSteps;
            _tmpSteps = _cursor.getInt(_cursorIndexOfSteps);
            final int _tmpKcal;
            _tmpKcal = _cursor.getInt(_cursorIndexOfKcal);
            final double _tmpKm;
            _tmpKm = _cursor.getDouble(_cursorIndexOfKm);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final Double _tmpStartLatitude;
            if (_cursor.isNull(_cursorIndexOfStartLatitude)) {
              _tmpStartLatitude = null;
            } else {
              _tmpStartLatitude = _cursor.getDouble(_cursorIndexOfStartLatitude);
            }
            final Double _tmpStartLongitude;
            if (_cursor.isNull(_cursorIndexOfStartLongitude)) {
              _tmpStartLongitude = null;
            } else {
              _tmpStartLongitude = _cursor.getDouble(_cursorIndexOfStartLongitude);
            }
            final Double _tmpEndLatitude;
            if (_cursor.isNull(_cursorIndexOfEndLatitude)) {
              _tmpEndLatitude = null;
            } else {
              _tmpEndLatitude = _cursor.getDouble(_cursorIndexOfEndLatitude);
            }
            final Double _tmpEndLongitude;
            if (_cursor.isNull(_cursorIndexOfEndLongitude)) {
              _tmpEndLongitude = null;
            } else {
              _tmpEndLongitude = _cursor.getDouble(_cursorIndexOfEndLongitude);
            }
            final double _tmpHighestSpeed;
            _tmpHighestSpeed = _cursor.getDouble(_cursorIndexOfHighestSpeed);
            final double _tmpAverageSpeed;
            _tmpAverageSpeed = _cursor.getDouble(_cursorIndexOfAverageSpeed);
            final String _tmpCoordinatesJson;
            if (_cursor.isNull(_cursorIndexOfCoordinatesJson)) {
              _tmpCoordinatesJson = null;
            } else {
              _tmpCoordinatesJson = _cursor.getString(_cursorIndexOfCoordinatesJson);
            }
            _item = new ActivityRecord(_tmpId,_tmpDate,_tmpStartTime,_tmpEndTime,_tmpDurationMinutes,_tmpSteps,_tmpKcal,_tmpKm,_tmpType,_tmpStartLatitude,_tmpStartLongitude,_tmpEndLatitude,_tmpEndLongitude,_tmpHighestSpeed,_tmpAverageSpeed,_tmpCoordinatesJson);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getAllSync(final Continuation<? super List<ActivityRecord>> $completion) {
    final String _sql = "SELECT * FROM activities ORDER BY startTime DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ActivityRecord>>() {
      @Override
      @NonNull
      public List<ActivityRecord> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfDurationMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "durationMinutes");
          final int _cursorIndexOfSteps = CursorUtil.getColumnIndexOrThrow(_cursor, "steps");
          final int _cursorIndexOfKcal = CursorUtil.getColumnIndexOrThrow(_cursor, "kcal");
          final int _cursorIndexOfKm = CursorUtil.getColumnIndexOrThrow(_cursor, "km");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStartLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLatitude");
          final int _cursorIndexOfStartLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLongitude");
          final int _cursorIndexOfEndLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLatitude");
          final int _cursorIndexOfEndLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLongitude");
          final int _cursorIndexOfHighestSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "highestSpeed");
          final int _cursorIndexOfAverageSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "averageSpeed");
          final int _cursorIndexOfCoordinatesJson = CursorUtil.getColumnIndexOrThrow(_cursor, "coordinatesJson");
          final List<ActivityRecord> _result = new ArrayList<ActivityRecord>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ActivityRecord _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final LocalDate _tmpDate;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp);
            final LocalDateTime _tmpStartTime;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __converters.toLocalDateTime(_tmp_1);
            final LocalDateTime _tmpEndTime;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __converters.toLocalDateTime(_tmp_2);
            final int _tmpDurationMinutes;
            _tmpDurationMinutes = _cursor.getInt(_cursorIndexOfDurationMinutes);
            final int _tmpSteps;
            _tmpSteps = _cursor.getInt(_cursorIndexOfSteps);
            final int _tmpKcal;
            _tmpKcal = _cursor.getInt(_cursorIndexOfKcal);
            final double _tmpKm;
            _tmpKm = _cursor.getDouble(_cursorIndexOfKm);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final Double _tmpStartLatitude;
            if (_cursor.isNull(_cursorIndexOfStartLatitude)) {
              _tmpStartLatitude = null;
            } else {
              _tmpStartLatitude = _cursor.getDouble(_cursorIndexOfStartLatitude);
            }
            final Double _tmpStartLongitude;
            if (_cursor.isNull(_cursorIndexOfStartLongitude)) {
              _tmpStartLongitude = null;
            } else {
              _tmpStartLongitude = _cursor.getDouble(_cursorIndexOfStartLongitude);
            }
            final Double _tmpEndLatitude;
            if (_cursor.isNull(_cursorIndexOfEndLatitude)) {
              _tmpEndLatitude = null;
            } else {
              _tmpEndLatitude = _cursor.getDouble(_cursorIndexOfEndLatitude);
            }
            final Double _tmpEndLongitude;
            if (_cursor.isNull(_cursorIndexOfEndLongitude)) {
              _tmpEndLongitude = null;
            } else {
              _tmpEndLongitude = _cursor.getDouble(_cursorIndexOfEndLongitude);
            }
            final double _tmpHighestSpeed;
            _tmpHighestSpeed = _cursor.getDouble(_cursorIndexOfHighestSpeed);
            final double _tmpAverageSpeed;
            _tmpAverageSpeed = _cursor.getDouble(_cursorIndexOfAverageSpeed);
            final String _tmpCoordinatesJson;
            if (_cursor.isNull(_cursorIndexOfCoordinatesJson)) {
              _tmpCoordinatesJson = null;
            } else {
              _tmpCoordinatesJson = _cursor.getString(_cursorIndexOfCoordinatesJson);
            }
            _item = new ActivityRecord(_tmpId,_tmpDate,_tmpStartTime,_tmpEndTime,_tmpDurationMinutes,_tmpSteps,_tmpKcal,_tmpKm,_tmpType,_tmpStartLatitude,_tmpStartLongitude,_tmpEndLatitude,_tmpEndLongitude,_tmpHighestSpeed,_tmpAverageSpeed,_tmpCoordinatesJson);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getById(final long id, final Continuation<? super ActivityRecord> $completion) {
    final String _sql = "SELECT * FROM activities WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ActivityRecord>() {
      @Override
      @Nullable
      public ActivityRecord call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfDurationMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "durationMinutes");
          final int _cursorIndexOfSteps = CursorUtil.getColumnIndexOrThrow(_cursor, "steps");
          final int _cursorIndexOfKcal = CursorUtil.getColumnIndexOrThrow(_cursor, "kcal");
          final int _cursorIndexOfKm = CursorUtil.getColumnIndexOrThrow(_cursor, "km");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStartLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLatitude");
          final int _cursorIndexOfStartLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLongitude");
          final int _cursorIndexOfEndLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLatitude");
          final int _cursorIndexOfEndLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLongitude");
          final int _cursorIndexOfHighestSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "highestSpeed");
          final int _cursorIndexOfAverageSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "averageSpeed");
          final int _cursorIndexOfCoordinatesJson = CursorUtil.getColumnIndexOrThrow(_cursor, "coordinatesJson");
          final ActivityRecord _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final LocalDate _tmpDate;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp);
            final LocalDateTime _tmpStartTime;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __converters.toLocalDateTime(_tmp_1);
            final LocalDateTime _tmpEndTime;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __converters.toLocalDateTime(_tmp_2);
            final int _tmpDurationMinutes;
            _tmpDurationMinutes = _cursor.getInt(_cursorIndexOfDurationMinutes);
            final int _tmpSteps;
            _tmpSteps = _cursor.getInt(_cursorIndexOfSteps);
            final int _tmpKcal;
            _tmpKcal = _cursor.getInt(_cursorIndexOfKcal);
            final double _tmpKm;
            _tmpKm = _cursor.getDouble(_cursorIndexOfKm);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final Double _tmpStartLatitude;
            if (_cursor.isNull(_cursorIndexOfStartLatitude)) {
              _tmpStartLatitude = null;
            } else {
              _tmpStartLatitude = _cursor.getDouble(_cursorIndexOfStartLatitude);
            }
            final Double _tmpStartLongitude;
            if (_cursor.isNull(_cursorIndexOfStartLongitude)) {
              _tmpStartLongitude = null;
            } else {
              _tmpStartLongitude = _cursor.getDouble(_cursorIndexOfStartLongitude);
            }
            final Double _tmpEndLatitude;
            if (_cursor.isNull(_cursorIndexOfEndLatitude)) {
              _tmpEndLatitude = null;
            } else {
              _tmpEndLatitude = _cursor.getDouble(_cursorIndexOfEndLatitude);
            }
            final Double _tmpEndLongitude;
            if (_cursor.isNull(_cursorIndexOfEndLongitude)) {
              _tmpEndLongitude = null;
            } else {
              _tmpEndLongitude = _cursor.getDouble(_cursorIndexOfEndLongitude);
            }
            final double _tmpHighestSpeed;
            _tmpHighestSpeed = _cursor.getDouble(_cursorIndexOfHighestSpeed);
            final double _tmpAverageSpeed;
            _tmpAverageSpeed = _cursor.getDouble(_cursorIndexOfAverageSpeed);
            final String _tmpCoordinatesJson;
            if (_cursor.isNull(_cursorIndexOfCoordinatesJson)) {
              _tmpCoordinatesJson = null;
            } else {
              _tmpCoordinatesJson = _cursor.getString(_cursorIndexOfCoordinatesJson);
            }
            _result = new ActivityRecord(_tmpId,_tmpDate,_tmpStartTime,_tmpEndTime,_tmpDurationMinutes,_tmpSteps,_tmpKcal,_tmpKm,_tmpType,_tmpStartLatitude,_tmpStartLongitude,_tmpEndLatitude,_tmpEndLongitude,_tmpHighestSpeed,_tmpAverageSpeed,_tmpCoordinatesJson);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<ActivityRecord>> getByDate(final LocalDate date) {
    final String _sql = "SELECT * FROM activities WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __converters.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"activities"}, new Callable<List<ActivityRecord>>() {
      @Override
      @NonNull
      public List<ActivityRecord> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfDurationMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "durationMinutes");
          final int _cursorIndexOfSteps = CursorUtil.getColumnIndexOrThrow(_cursor, "steps");
          final int _cursorIndexOfKcal = CursorUtil.getColumnIndexOrThrow(_cursor, "kcal");
          final int _cursorIndexOfKm = CursorUtil.getColumnIndexOrThrow(_cursor, "km");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStartLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLatitude");
          final int _cursorIndexOfStartLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLongitude");
          final int _cursorIndexOfEndLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLatitude");
          final int _cursorIndexOfEndLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLongitude");
          final int _cursorIndexOfHighestSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "highestSpeed");
          final int _cursorIndexOfAverageSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "averageSpeed");
          final int _cursorIndexOfCoordinatesJson = CursorUtil.getColumnIndexOrThrow(_cursor, "coordinatesJson");
          final List<ActivityRecord> _result = new ArrayList<ActivityRecord>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ActivityRecord _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final LocalDate _tmpDate;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp_1);
            final LocalDateTime _tmpStartTime;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __converters.toLocalDateTime(_tmp_2);
            final LocalDateTime _tmpEndTime;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __converters.toLocalDateTime(_tmp_3);
            final int _tmpDurationMinutes;
            _tmpDurationMinutes = _cursor.getInt(_cursorIndexOfDurationMinutes);
            final int _tmpSteps;
            _tmpSteps = _cursor.getInt(_cursorIndexOfSteps);
            final int _tmpKcal;
            _tmpKcal = _cursor.getInt(_cursorIndexOfKcal);
            final double _tmpKm;
            _tmpKm = _cursor.getDouble(_cursorIndexOfKm);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final Double _tmpStartLatitude;
            if (_cursor.isNull(_cursorIndexOfStartLatitude)) {
              _tmpStartLatitude = null;
            } else {
              _tmpStartLatitude = _cursor.getDouble(_cursorIndexOfStartLatitude);
            }
            final Double _tmpStartLongitude;
            if (_cursor.isNull(_cursorIndexOfStartLongitude)) {
              _tmpStartLongitude = null;
            } else {
              _tmpStartLongitude = _cursor.getDouble(_cursorIndexOfStartLongitude);
            }
            final Double _tmpEndLatitude;
            if (_cursor.isNull(_cursorIndexOfEndLatitude)) {
              _tmpEndLatitude = null;
            } else {
              _tmpEndLatitude = _cursor.getDouble(_cursorIndexOfEndLatitude);
            }
            final Double _tmpEndLongitude;
            if (_cursor.isNull(_cursorIndexOfEndLongitude)) {
              _tmpEndLongitude = null;
            } else {
              _tmpEndLongitude = _cursor.getDouble(_cursorIndexOfEndLongitude);
            }
            final double _tmpHighestSpeed;
            _tmpHighestSpeed = _cursor.getDouble(_cursorIndexOfHighestSpeed);
            final double _tmpAverageSpeed;
            _tmpAverageSpeed = _cursor.getDouble(_cursorIndexOfAverageSpeed);
            final String _tmpCoordinatesJson;
            if (_cursor.isNull(_cursorIndexOfCoordinatesJson)) {
              _tmpCoordinatesJson = null;
            } else {
              _tmpCoordinatesJson = _cursor.getString(_cursorIndexOfCoordinatesJson);
            }
            _item = new ActivityRecord(_tmpId,_tmpDate,_tmpStartTime,_tmpEndTime,_tmpDurationMinutes,_tmpSteps,_tmpKcal,_tmpKm,_tmpType,_tmpStartLatitude,_tmpStartLongitude,_tmpEndLatitude,_tmpEndLongitude,_tmpHighestSpeed,_tmpAverageSpeed,_tmpCoordinatesJson);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<ActivityRecord>> getByRange(final LocalDate start, final LocalDate end) {
    final String _sql = "SELECT * FROM activities WHERE date BETWEEN ? AND ? ORDER BY startTime DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final String _tmp = __converters.fromLocalDate(start);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 2;
    final String _tmp_1 = __converters.fromLocalDate(end);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp_1);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"activities"}, new Callable<List<ActivityRecord>>() {
      @Override
      @NonNull
      public List<ActivityRecord> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfDurationMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "durationMinutes");
          final int _cursorIndexOfSteps = CursorUtil.getColumnIndexOrThrow(_cursor, "steps");
          final int _cursorIndexOfKcal = CursorUtil.getColumnIndexOrThrow(_cursor, "kcal");
          final int _cursorIndexOfKm = CursorUtil.getColumnIndexOrThrow(_cursor, "km");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStartLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLatitude");
          final int _cursorIndexOfStartLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLongitude");
          final int _cursorIndexOfEndLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLatitude");
          final int _cursorIndexOfEndLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLongitude");
          final int _cursorIndexOfHighestSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "highestSpeed");
          final int _cursorIndexOfAverageSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "averageSpeed");
          final int _cursorIndexOfCoordinatesJson = CursorUtil.getColumnIndexOrThrow(_cursor, "coordinatesJson");
          final List<ActivityRecord> _result = new ArrayList<ActivityRecord>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ActivityRecord _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final LocalDate _tmpDate;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp_2);
            final LocalDateTime _tmpStartTime;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __converters.toLocalDateTime(_tmp_3);
            final LocalDateTime _tmpEndTime;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __converters.toLocalDateTime(_tmp_4);
            final int _tmpDurationMinutes;
            _tmpDurationMinutes = _cursor.getInt(_cursorIndexOfDurationMinutes);
            final int _tmpSteps;
            _tmpSteps = _cursor.getInt(_cursorIndexOfSteps);
            final int _tmpKcal;
            _tmpKcal = _cursor.getInt(_cursorIndexOfKcal);
            final double _tmpKm;
            _tmpKm = _cursor.getDouble(_cursorIndexOfKm);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final Double _tmpStartLatitude;
            if (_cursor.isNull(_cursorIndexOfStartLatitude)) {
              _tmpStartLatitude = null;
            } else {
              _tmpStartLatitude = _cursor.getDouble(_cursorIndexOfStartLatitude);
            }
            final Double _tmpStartLongitude;
            if (_cursor.isNull(_cursorIndexOfStartLongitude)) {
              _tmpStartLongitude = null;
            } else {
              _tmpStartLongitude = _cursor.getDouble(_cursorIndexOfStartLongitude);
            }
            final Double _tmpEndLatitude;
            if (_cursor.isNull(_cursorIndexOfEndLatitude)) {
              _tmpEndLatitude = null;
            } else {
              _tmpEndLatitude = _cursor.getDouble(_cursorIndexOfEndLatitude);
            }
            final Double _tmpEndLongitude;
            if (_cursor.isNull(_cursorIndexOfEndLongitude)) {
              _tmpEndLongitude = null;
            } else {
              _tmpEndLongitude = _cursor.getDouble(_cursorIndexOfEndLongitude);
            }
            final double _tmpHighestSpeed;
            _tmpHighestSpeed = _cursor.getDouble(_cursorIndexOfHighestSpeed);
            final double _tmpAverageSpeed;
            _tmpAverageSpeed = _cursor.getDouble(_cursorIndexOfAverageSpeed);
            final String _tmpCoordinatesJson;
            if (_cursor.isNull(_cursorIndexOfCoordinatesJson)) {
              _tmpCoordinatesJson = null;
            } else {
              _tmpCoordinatesJson = _cursor.getString(_cursorIndexOfCoordinatesJson);
            }
            _item = new ActivityRecord(_tmpId,_tmpDate,_tmpStartTime,_tmpEndTime,_tmpDurationMinutes,_tmpSteps,_tmpKcal,_tmpKm,_tmpType,_tmpStartLatitude,_tmpStartLongitude,_tmpEndLatitude,_tmpEndLongitude,_tmpHighestSpeed,_tmpAverageSpeed,_tmpCoordinatesJson);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<ActivityRecord>> getByType(final String type) {
    final String _sql = "SELECT * FROM activities WHERE type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"activities"}, new Callable<List<ActivityRecord>>() {
      @Override
      @NonNull
      public List<ActivityRecord> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfDurationMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "durationMinutes");
          final int _cursorIndexOfSteps = CursorUtil.getColumnIndexOrThrow(_cursor, "steps");
          final int _cursorIndexOfKcal = CursorUtil.getColumnIndexOrThrow(_cursor, "kcal");
          final int _cursorIndexOfKm = CursorUtil.getColumnIndexOrThrow(_cursor, "km");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfStartLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLatitude");
          final int _cursorIndexOfStartLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "startLongitude");
          final int _cursorIndexOfEndLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLatitude");
          final int _cursorIndexOfEndLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "endLongitude");
          final int _cursorIndexOfHighestSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "highestSpeed");
          final int _cursorIndexOfAverageSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "averageSpeed");
          final int _cursorIndexOfCoordinatesJson = CursorUtil.getColumnIndexOrThrow(_cursor, "coordinatesJson");
          final List<ActivityRecord> _result = new ArrayList<ActivityRecord>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ActivityRecord _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final LocalDate _tmpDate;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDate);
            }
            _tmpDate = __converters.toLocalDate(_tmp);
            final LocalDateTime _tmpStartTime;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __converters.toLocalDateTime(_tmp_1);
            final LocalDateTime _tmpEndTime;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __converters.toLocalDateTime(_tmp_2);
            final int _tmpDurationMinutes;
            _tmpDurationMinutes = _cursor.getInt(_cursorIndexOfDurationMinutes);
            final int _tmpSteps;
            _tmpSteps = _cursor.getInt(_cursorIndexOfSteps);
            final int _tmpKcal;
            _tmpKcal = _cursor.getInt(_cursorIndexOfKcal);
            final double _tmpKm;
            _tmpKm = _cursor.getDouble(_cursorIndexOfKm);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final Double _tmpStartLatitude;
            if (_cursor.isNull(_cursorIndexOfStartLatitude)) {
              _tmpStartLatitude = null;
            } else {
              _tmpStartLatitude = _cursor.getDouble(_cursorIndexOfStartLatitude);
            }
            final Double _tmpStartLongitude;
            if (_cursor.isNull(_cursorIndexOfStartLongitude)) {
              _tmpStartLongitude = null;
            } else {
              _tmpStartLongitude = _cursor.getDouble(_cursorIndexOfStartLongitude);
            }
            final Double _tmpEndLatitude;
            if (_cursor.isNull(_cursorIndexOfEndLatitude)) {
              _tmpEndLatitude = null;
            } else {
              _tmpEndLatitude = _cursor.getDouble(_cursorIndexOfEndLatitude);
            }
            final Double _tmpEndLongitude;
            if (_cursor.isNull(_cursorIndexOfEndLongitude)) {
              _tmpEndLongitude = null;
            } else {
              _tmpEndLongitude = _cursor.getDouble(_cursorIndexOfEndLongitude);
            }
            final double _tmpHighestSpeed;
            _tmpHighestSpeed = _cursor.getDouble(_cursorIndexOfHighestSpeed);
            final double _tmpAverageSpeed;
            _tmpAverageSpeed = _cursor.getDouble(_cursorIndexOfAverageSpeed);
            final String _tmpCoordinatesJson;
            if (_cursor.isNull(_cursorIndexOfCoordinatesJson)) {
              _tmpCoordinatesJson = null;
            } else {
              _tmpCoordinatesJson = _cursor.getString(_cursorIndexOfCoordinatesJson);
            }
            _item = new ActivityRecord(_tmpId,_tmpDate,_tmpStartTime,_tmpEndTime,_tmpDurationMinutes,_tmpSteps,_tmpKcal,_tmpKm,_tmpType,_tmpStartLatitude,_tmpStartLongitude,_tmpEndLatitude,_tmpEndLongitude,_tmpHighestSpeed,_tmpAverageSpeed,_tmpCoordinatesJson);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Integer> getCount() {
    final String _sql = "SELECT COUNT(*) FROM activities";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"activities"}, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Integer> getTotalStepsForDate(final LocalDate date) {
    final String _sql = "SELECT SUM(steps) FROM activities WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __converters.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"activities"}, new Callable<Integer>() {
      @Override
      @Nullable
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp_1;
            if (_cursor.isNull(0)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(0);
            }
            _result = _tmp_1;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Integer> getTotalCaloriesForDate(final LocalDate date) {
    final String _sql = "SELECT SUM(kcal) FROM activities WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __converters.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"activities"}, new Callable<Integer>() {
      @Override
      @Nullable
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp_1;
            if (_cursor.isNull(0)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(0);
            }
            _result = _tmp_1;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Float> getTotalDistanceForDate(final LocalDate date) {
    final String _sql = "SELECT SUM(km) FROM activities WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __converters.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"activities"}, new Callable<Float>() {
      @Override
      @Nullable
      public Float call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Float _result;
          if (_cursor.moveToFirst()) {
            final Float _tmp_1;
            if (_cursor.isNull(0)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getFloat(0);
            }
            _result = _tmp_1;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
