<template>
  <div id="login-dropdown">
    <div class="form-group">
      <label for="usr">Username:</label>
      <input type="text" class="form-control" id="usr">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd">
    </div>
    <button type="button" class="btn btn-primary" href="/account">Login</button>
  </div>
</template>

<script lang="ts">
import Vue from 'vue';

export default {
};
</script>

<style lang="scss">
</style>
