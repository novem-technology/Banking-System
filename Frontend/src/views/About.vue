<template>
  <div class="about">
    <Navbar/>
    <h1>This is an about page</h1>
  </div>
</template>

<script lang="ts">
import Vue from 'vue';
import Navbar from '@/components/Navbar.vue';

export default {
  components: {
    Navbar,
  },
};
</script>
